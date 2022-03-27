
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        int quantity = 3;
        double price = 49.99, tax = 0.17;
        
        // Declare and assign a calculated totalPrice
        double totalPrice = (price * quantity)*tax;
        
        // Modify message to include quantity 
        message = custName+" wants to purchase "+quantity+" "+itemDesc;
        System.out.println(message);
        System.out.println("The total cost of the purchase is: $"+totalPrice);
        
        // Print another message with the total cost
        
    }    
}
