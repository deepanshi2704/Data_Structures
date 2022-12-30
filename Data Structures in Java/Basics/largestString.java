public class largestString {
    public static void main(String args[]) {

        String fruits[] = { "apple", "pear", "orange" };
        String largest = fruits[0];

        int n = fruits.length;

        for (int i = 1; i < n; i++) {

            // largest <fruits[i]
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("Largest substring is: " + largest);
    }
}
