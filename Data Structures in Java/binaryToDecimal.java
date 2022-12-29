import java.util.*;

public class binaryToDecimal {
    public static void binToDec(int bn) {
        int mynum = bn;
        int dn = 0;
        int pow = 0;

        while (bn > 0) {
            int last_digit = bn % 10;

            dn = dn + (last_digit * (int) Math.pow(2, pow));
            pow++;
            bn = bn / 10;
        }
        System.out.println("decimal number of " + mynum + " is: " + dn);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int n = sc.nextInt();
        binToDec(n);
        sc.close();
    }
}
