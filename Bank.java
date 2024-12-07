//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import java.util.Scanner;

public class Bank {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int balance = 10000;
    int userinput;

    System.out.println("1. Enter number (1) view account balance: " );
    System.out.println("2. Enter number (2) deposit funds: " );
    System.out.println("3. Enter number (3) withdraw funds: " );
    System.out.println("Enter number (4) exit: " );
    userinput = sc.nextInt();

    switch (userinput) {
        case 1:
            System.out.println("balance: " + balance);
            break;

        case 2:
            System.out.println("Enter deposit");
            int userfunds = sc.nextInt();
            System.out.println("your new balance is : " + (userfunds + balance));
            break;

        case 3:
            System.out.println("Enter withdraw");
            int userwithdraw = sc.nextInt();
        if(userwithdraw > balance){
             System.out.println("insufficient balance");
        }else{
             System.out.println("you withdraw: " + balance);
             System.out.println("your new balance is : " + (balance - userwithdraw));
            }
            break;

        default:userinput = 4; {
            System.out.println("Thank you");
        }
        sc.close();
    }
}
}