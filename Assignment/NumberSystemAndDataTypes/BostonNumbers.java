//https://hack.codingblocks.com/app/contests/9341/495/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class BostonNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        n = original;
        int factorSum = 0;
        int count = 0;
        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {
                count++;
                int temp = i;

                while (temp > 0) {
                    factorSum += temp % 10;
                    temp /= 10;
                }

                n /= i;
            }
        }

        if (n > 1) {
            count++;
            int temp = n;
            while (temp > 0) {
                factorSum += temp % 10;
                temp /= 10;
            }
        }

        if (count > 1 && sum == factorSum)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
