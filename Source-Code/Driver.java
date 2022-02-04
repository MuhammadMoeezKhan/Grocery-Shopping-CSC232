import java.math.BigDecimal;

public class Driver{

public static void main(String[] args){

    Order myOrder = new Order( );
    myOrder.addItem(new Product("Apples", "3.16") );
    myOrder.addItem(new Product("Bananas", "1.06") );
    BigDecimal finalPrice = myOrder.calculateFinalPrice( new BigDecimal("0.06") );
    System.out.println(myOrder.getItem("apples"));
    System.out.println(myOrder.removeItem("apples"));
    System.out.println( finalPrice.toString( ) ); 
}

}