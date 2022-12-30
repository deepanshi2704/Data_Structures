public class NumberToName {

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numToName(int n) {
        if (n == 0) {
            return;
        }

        int last_digit = n % 10;
        numToName(n / 10);
        System.out.print(digits[last_digit] + " ");
    }

    public static void main(String args[]) {
        numToName(60111145);
    }
}
