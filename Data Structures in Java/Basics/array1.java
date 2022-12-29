import java.util.*;

public class array1 {

    public static boolean duplicate(int nums[]) {
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean m = duplicate(nums);
        System.out.println(m);
        sc.close();
    }
}
