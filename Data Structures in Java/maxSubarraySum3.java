//KADAN'S ALGORITHM

public class maxSubarraySum3 {
    public static void kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];

            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        kadanes(arr);
    }
}
