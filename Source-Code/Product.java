import java.math.BigDecimal;

public class Product {

private String name;
private BigDecimal price;

public Product (String pName, String pPrice){
name=pName;
price = new BigDecimal(pPrice);
}

public  String getName(){
    return name;
}

public  BigDecimal getPrice(){
    return price;
}
}
