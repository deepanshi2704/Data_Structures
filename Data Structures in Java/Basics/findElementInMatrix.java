import java.util.*;

public class findElementInMatrix {
    public static boolean search(int matrix[][], int key) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at: " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        boolean result = search(matrix, key);
        System.out.println(result);
        sc.close();
    }
}
