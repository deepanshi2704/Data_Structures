public class DiagonalSum {
    public static int diagonal_sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            // primary sum
            sum = sum + matrix[i][i];

            // secondary sum
            if (i != matrix.length - 1 - i) {
                sum = sum + matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int total = diagonal_sum(matrix);
        System.out.println(total);
    }
}
