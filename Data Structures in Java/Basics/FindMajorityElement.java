public class FindMajorityElement {

    private static int countInRange(int nums[], int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i < hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int nums[], int lo, int hi) {

        // base : if there is only one element in the array -> it itself is the majority
        // element
        if (lo == hi) {
            return nums[lo];
        }
        // recurses on left and right halves
        int mid = lo + (hi - lo) / 2;
        int left = majorityElementRec(nums, lo, mid); // returns majority element of left part
        int right = majorityElementRec(nums, mid + 1, hi); // returns majority element of right part

        // if both of them agree on majority element
        if (left == right) {
            return left;
        }

        // otherwise count each element and return the winner
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int nums[]) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("The majority element is: " + majorityElement(nums));
    }
}
