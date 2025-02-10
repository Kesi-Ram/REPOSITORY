import java.util.Arrays;

public class MergeSort {
    static int counter = 0;

    public static void mergeSort(int[] arr, int left, int right) {
        counter++;
        if (left < right) {
            counter++;
            int mid = left + (right - left) / 2;
            counter++;
            mergeSort(arr, left, mid);
            counter++;
            mergeSort(arr, mid + 1, right);
            counter++;
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        counter++;
        int n1 = mid - left + 1;
        counter++;
        int n2 = right - mid;
        counter++;

        int[] L = new int[n1];
        counter++;
        int[] R = new int[n2];
        counter++;

        for (int i = 0; i < n1; ++i) {
            counter++;
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; ++j) {
            counter++;
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        counter++;
        int k = left;
        counter++;
        while (i < n1 && j < n2) {
            counter++;
            if (L[i] <= R[j]) {
                counter++;
                arr[k] = L[i];
                i++;
            } else {
                counter++;
                arr[k] = R[j];
                j++;
            }
            k++;
            counter++;
        }

        while (i < n1) {
            counter++;
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            counter++;
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
        System.out.println("Instruction Count: " + counter);
    }
}