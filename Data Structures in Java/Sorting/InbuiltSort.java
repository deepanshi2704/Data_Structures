import java.util.*;

public class InbuiltSort {

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };

        // In ascending order
        Arrays.sort(arr); // first way
        printArr(arr);

        // In descending order
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}