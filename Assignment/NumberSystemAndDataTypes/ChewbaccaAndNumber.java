//https://hack.codingblocks.com/app/contests/9341/132/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        long ans = 0;
        boolean firstDigit = true;

        while (rev > 0) {

            int digit = (int)(rev % 10);
            int inv = 9 - digit;

            if (firstDigit) {
                if (inv != 0 && inv < digit)
                    digit = inv;

                firstDigit = false;
            } else {
                if (inv < digit)
                    digit = inv;
            }

            ans = ans * 10 + digit;
            rev /= 10;
        }

        System.out.println(ans);
    }
}



