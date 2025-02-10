import java.util.LinkedList;
import java.util.Scanner;

public class QueueOperations {

    static class Queue {
        LinkedList<Integer> queue;

        // Constructor to initialize the queue
        public Queue() {
            queue = new LinkedList<>();
        }

        // ENQUEUE operation
        public void enqueue(int data) {
            queue.add(data);
            System.out.println("Enqueued: " + data);
        }

        // DEQUEUE operation
        public void dequeue() {
            if (!queue.isEmpty()) {
                int removedData = queue.removeFirst();
                System.out.println("Dequeued: " + removedData);
            } else {
                System.out.println("Queue is empty, cannot dequeue.");
            }
        }

        // Display the contents of the queue
        public void display() {
            if (!queue.isEmpty()) {
                System.out.println("Queue contents: " + queue);
            } else {
                System.out.println("Queue is empty.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();

        while (true) {
            // Display the menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");

            // Read user choice
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
                case 1:
                    // Enqueue operation
                    System.out.print("Enter an integer to enqueue: ");
                    int data = 0;
                    validInput = false;
                    while (!validInput) {
                        try {
                            data = Integer.parseInt(scanner.next());
                            validInput = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please enter an integer.");
                        }
                    }
                    queue.enqueue(data);
                    break;

                case 2:
                    // Dequeue operation
                    queue.dequeue();
                    break;

                case 3:
                    // Display queue contents
                    queue.display();
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return; // Terminate the program

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}
