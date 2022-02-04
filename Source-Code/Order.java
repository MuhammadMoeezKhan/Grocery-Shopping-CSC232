import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.lang.String;

public class Order {

private ArrayList<Product> products;
private BigDecimal total;


public Order(){
products = new ArrayList<Product>();
total = new BigDecimal("0");
}   

public void addItem(Product newProd){
products.add(newProd);
total = total.add(newProd.getPrice());
}

public Product getItem(String inputName){

  for(int i = 0; i<products.size(); i++){

    if(inputName.equalsIgnoreCase(products.get(i).getName())){
      return products.get(i);
    }

  }
  return null;
}

public boolean removeItem(String removeName){

for(int i = 0; i<products.size(); i++){

  if(removeName.equalsIgnoreCase(products.get(i).getName())){
    products.remove(products.get(i));
    total.subtract(products.get(i).getPrice());
    return true;
  }
  
    }

    return false;
}

public BigDecimal calculateFinalPrice(BigDecimal salesTax){

  BigDecimal tax = total.multiply(salesTax);
  BigDecimal totalPrice = total.add(tax);

  BigDecimal finalPrice = totalPrice.setScale(2, RoundingMode.DOWN);

  return finalPrice;
}

}

