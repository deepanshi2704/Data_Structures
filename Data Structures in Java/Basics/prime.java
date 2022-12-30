import java.util.*;

public class prime {
    public static boolean isPrime(int n) {
        System.out.print(n + " is prime: ");
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
