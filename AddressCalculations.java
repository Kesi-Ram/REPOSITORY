import java.util.Scanner;

public class AddressCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept base address (alpha)
        System.out.print("Enter the base address (alpha): ");
        int alpha = scanner.nextInt();

        // Accept element size (esize)
        System.out.print("Enter the element size (esize): ");
        int esize = scanner.nextInt();

        // Accept number of dimensions
        System.out.print("Enter the number of dimensions: ");
        int dimensions = scanner.nextInt();

        // Accept size of each dimension
        int[] sizes = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            System.out.print("Enter the size of dimension " + (i + 1) + ": ");
            sizes[i] = scanner.nextInt();
        }

        // Compute total number of elements
        int totalElements = 1;
        for (int size : sizes) {
            totalElements *= size;
        }
        System.out.println("Total number of elements: " + totalElements);

        // Accept indices for address calculation
        int[] indices = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            System.out.print("Enter the index for dimension " + (i + 1) + ": ");
            indices[i] = scanner.nextInt();
        }

        // Compute address
        int address = alpha;
        for (int i = 0; i < dimensions; i++) {
            int product = 1;
            for (int j = i + 1; j < dimensions; j++) {
                product *= sizes[j];
            }
            address += indices[i] * product * esize;
        }
        System.out.println("Computed address: " + address);

        scanner.close();
    }
}