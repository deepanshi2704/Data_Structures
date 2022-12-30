public class totalOccurences {

    public static void totOccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        totOccurence(arr, key, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        totOccurence(arr, 2, 0);
    }
}
