import java.util.*;

public class linearSearch {
    public static int linSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        // int numbers[] = { 2, 4, 6, 8, 10, 12 };
        // int key = 10;

        int index = linSearch(numbers, key);

        if (index == -1) {
            System.out.println("key not found!");
        } else {
            System.out.println("the key is at index: " + index);
        }
        sc.close();
    }
}
