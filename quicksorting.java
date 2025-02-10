import java.util.Arrays;

public class quicksorting {
    static int counter = 0;

    public static void quickSort(int[] arr, int low, int high) {
        counter++;
        if (low < high) {
            counter++;
            int pi = partition(arr, low, high);
            counter++;
            quickSort(arr, low, pi - 1);
            counter++;
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        counter++;
        int pivot = arr[high];
        counter++;
        int i = (low - 1);
        counter++;

        for (int j = low; j < high; j++) {
            counter++;
            if (arr[j] < pivot) {
                counter++;
                i++;
                counter++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        counter++;
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        counter++;
        int temp = arr[i];
        counter++;
        arr[i] = arr[j];
        counter++;
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
        System.out.println("Instruction Count: " + counter);
    }
}