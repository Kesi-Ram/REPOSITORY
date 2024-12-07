
//Kacey Royce Tyne Sangbaan
//CITCS 1N
//


import java.util.Scanner;


public class GroceryCalculator{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double subtotal;
        double price;
        int qty;
        double discount;
        double salestax;
        double finaltotal;

        
        System.out.println("Enter your Item 1 price: ");
        price = sc.nextDouble();

        System.out.println("Enter your Item 1 Quantity: ");
        qty = sc.nextInt();

        System.out.println("Enter your Item 2 price: ");
        price = sc.nextDouble();

        System.out.println("Enter your Item 2 Quantity: ");
        qty = sc.nextInt();

        System.out.println("Enter your Item 3 price: ");
        price = sc.nextDouble();

        System.out.println("Enter your Item 3 Quantity: ");
        qty = sc.nextInt();



         subtotal = ((price*qty) + (price*qty) + (price*qty));
         discount = ((subtotal * 0.05));
         salestax = ((subtotal - discount) * 0.12);
         finaltotal = ((subtotal - discount) + salestax);


         System.out.println("Your item subtotal is: " + subtotal);
         System.out.println("Your item discount is: " + discount);
         System.out.println("Your item salestax is: " + salestax);
         System.out.println("Your item Final Total is: " + finaltotal);

         sc.close();
    }
}