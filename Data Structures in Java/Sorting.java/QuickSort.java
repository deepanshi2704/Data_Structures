public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // base
        if (si >= ei) {
            return;
        }

        // pivot index
        int pivIndex = partition(arr, si, ei);
        quickSort(arr, si, pivIndex - 1); // left to pivot
        quickSort(arr, pivIndex + 1, ei); // right to pivot
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) { // for comparing the elements less than pivot element
            if (arr[j] < pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
