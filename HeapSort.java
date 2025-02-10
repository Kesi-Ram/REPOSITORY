import java.util.Arrays;

public class HeapSort {
    static int counter = 0;

    public static void heapSort(int[] arr) {
        counter++;
        int n = arr.length;
        counter++;

        for (int i = n / 2 - 1; i >= 0; i--) {
            counter++;
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            counter++;
            int temp = arr[0];
            counter++;
            arr[0] = arr[i];
            counter++;
            arr[i] = temp;
            counter++;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        counter++;
        int largest = i;
        counter++;
        int left = 2 * i + 1;
        counter++;
        int right = 2 * i + 2;
        counter++;

        if (left < n && arr[left] > arr[largest]) {
            counter++;
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            counter++;
            largest = right;
        }

        if (largest != i) {
            counter++;
            int swap = arr[i];
            counter++;
            arr[i] = arr[largest];
            counter++;
            arr[largest] = swap;
            counter++;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        heapSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
        System.out.println("Instruction Count: " + counter);
    }
}