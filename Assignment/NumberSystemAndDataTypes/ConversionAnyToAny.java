//https://hack.codingblocks.com/app/contests/9341/399/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class ConversionAnyToAny {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int src = sc.nextInt();
        int dest = sc.nextInt();
        int n = sc.nextInt();

        // Step 1: Convert source base to decimal
        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int rem = n % 10;
            decimal += rem * power;
            power *= src;
            n /= 10;
        }

        // Step 2: Convert decimal to destination base
        int ans = 0;
        power = 1;

        while (decimal > 0) {
            int rem = decimal % dest;
            ans += rem * power;
            power *= 10;
            decimal /= dest;
        }

        System.out.println(ans);
    }
}