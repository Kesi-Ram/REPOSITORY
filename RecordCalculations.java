import java.util.Scanner;

public class RecordCalculations {
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

        // Create a record to hold the array information
        ArrayInfo arrayInfo = new ArrayInfo(alpha, esize, dimensions, sizes, indices);

        // Compute address
        int address = computeAddress(arrayInfo);
        System.out.println("Computed address: " + address);

        scanner.close();
    }

    public static int computeAddress(ArrayInfo arrayInfo) {
        int address = arrayInfo.alpha();
        for (int i = 0; i < arrayInfo.dimensions(); i++) {
            int product = 1;
            for (int j = i + 1; j < arrayInfo.dimensions(); j++) {
                product *= arrayInfo.sizes()[j];
            }
            address += arrayInfo.indices()[i] * product * arrayInfo.esize();
        }
        return address;
    }

    public record ArrayInfo(int alpha, int esize, int dimensions, int[] sizes, int[] indices) {}
}