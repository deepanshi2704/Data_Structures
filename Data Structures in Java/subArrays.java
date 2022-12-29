public class subArrays {
    public static void subArr(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("total subarrays are: " + ts);
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        subArr(arr);
    }
}
