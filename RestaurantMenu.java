//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import java.util.Scanner;

public class RestaurantMenu{
    public static void main(String[] args) {
        int userInput, qty, price1= 100, price2= 50, price3= 30, price4= 45;

        System.out.println("1. burger - PHP" + price1);
        System.out.println("2. Fries - PHP" + price2);
        System.out.println("3. Soda - PHP" + price3);
        System.out.println("4. Ice Cream - PHP" + price4);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the menu number: ");
        System.out.println("Enter number 5 to exit: ");
        userInput = sc.nextInt();



        switch (userInput) {
            case 1 -> {
                System.out.println("Your order is Burger");
                System.out.println("Enter quantity");
                qty = sc.nextInt();
                System.out.println("Your total is: " + (qty * price1) + "Thank you for shopping");
            }
    
            case 2 -> {
                System.out.println("Your order is Fries");
                System.out.println("Enter quantity");
                qty = sc.nextInt();
                System.out.println("Your total is: " + (qty * price2) + "Thank you for shopping");
            }
    
            case 3 -> {
                System.out.println("Your order is Soda");
                System.out.println("Enter quantity");
                qty = sc.nextInt();
                System.out.println("Your total is: " + (qty * price3) + "Thank you for shopping");
            }
            
            case 4 -> {
                System.out.println("Your order is Ice Cream");
                System.out.println("Enter quantity");
                qty = sc.nextInt();
                System.out.println("Your total is: " + (qty * price4) + "Thank you for shopping");
            }
    
           default -> {
                System.out.println("Thank you for shopping");
            }
       }
       }
    }
  

