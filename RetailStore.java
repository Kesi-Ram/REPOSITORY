//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A

import java.util.Scanner;

public class RetailStore{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//declaring variables
        int numProduct = 10;//limit or how many items can be stored in the arrays
        int[] quantity = new int [numProduct];
        double[] prices = new double [numProduct];
        double totalStocksValue = 0, highestValue = 0, lowestValue = Double.MAX_VALUE;//for computing the avarage, highest and lowest

//for asking the user input to be stored in the array
        for (int i =  0; i < numProduct; i++){
            System.out.println("Enter quantity of product " + (i+1) + ": ");
            quantity[i] = sc.nextInt();

            System.out.println("Enter prices of product " + (i+1) + ": ");
            prices[i] = sc.nextDouble();
        }
//computation
        for (int i = 0; i < numProduct; i++) {
            double productValue = quantity[i] * prices[i];
            totalStocksValue =+ productValue;

            if (productValue > highestValue) {
                highestValue = productValue;
            }
            if (productValue < lowestValue) {
                lowestValue = productValue;
            }
        }
//display
        double averageValue = totalStocksValue / quantity.length;
        System.out.printf("Total value of item in the stock: $%.2f",totalStocksValue);
        System.out.printf("\nThe highests value of items in the stock: $%.2f",highestValue);
        System.out.printf("\nThe lowest value of items in the stock: $%.2f",lowestValue);
        System.out.printf("\nTotal average of items in the stock: $%.2f",averageValue);
        
        sc.close();
    }
}