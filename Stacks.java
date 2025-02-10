import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Stacks and Queues Operations!");

        // Stacks Operations
        System.out.println("\nPart I: Stacks Operations");
        Stack<Integer> stack = new Stack<>();
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            int choice = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter your choice: ");
                    choice = Integer.parseInt(scanner.next());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number between 1 and 4.");
                }
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to PUSH: ");
                    int element = 0;
                    validInput = false;
                    while (!validInput) {
                        try {
                            element = Integer.parseInt(scanner.next());
                            validInput = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please enter an integer.");
                        }
                    }
                    stack.push(element);
                }
                case 2 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    }
                }
                case 3 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println("Stack contents: " + stack);
                    }
                }
                case 4 -> {
                    System.out.println("Exiting Stacks Operations");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}