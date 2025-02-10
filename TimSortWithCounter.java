import java.util.Arrays;

public class TimSortWithCounter {
    static int counter = 0;

    public static void timSort(int[] arr) {
        counter++;
        Arrays.sort(arr);
        counter++;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        long startTime = System.nanoTime();
        timSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Instruction Count: " + counter);
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }
}