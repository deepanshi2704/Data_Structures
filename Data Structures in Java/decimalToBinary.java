import java.util.*;

public class decimalToBinary {
    public static void decToBin(int dn) {
        int mynum = dn;
        int bn = 0;
        int pow = 0;

        while (dn > 0) {
            int rem = dn % 2;

            bn = bn + (rem * (int) Math.pow(10, pow));
            pow++;
            dn = dn / 2;
        }
        System.out.println("binary number of " + mynum + " is: " + bn);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        decToBin(n);
        sc.close();
    }
}
