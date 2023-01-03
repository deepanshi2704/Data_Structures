public class TilingProblem2 {
    public static int placeTile(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n < m) {

            return 1;
        }

        // vertically
        int vertPlacements = placeTile(n - m, m);

        // horizontally
        int horPlacements = placeTile(n - 1, m);

        return vertPlacements + horPlacements;
    }

    public static void main(String args[]) {
        int n = 4;
        int m = 2;
        System.out.println(placeTile(n, m));
    }
}
