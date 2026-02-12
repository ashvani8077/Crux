package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class LCM {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        System.out.println(lcm(n1, n2));
    }
}
