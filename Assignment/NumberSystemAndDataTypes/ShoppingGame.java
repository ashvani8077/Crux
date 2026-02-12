//https://hack.codingblocks.com/app/contests/9341/696/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class ShoppingGame {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int m = sc.nextInt(); // Aayush limit
            int n = sc.nextInt(); // Harshit limit

            int turn = 1;

            while (true) {

                if (turn % 2 != 0) {   // Aayush turn
                    if (m >= turn) {
                        m -= turn;
                    } else {
                        System.out.println("Harshit");
                        break;
                    }
                } else {              // Harshit turn
                    if (n >= turn) {
                        n -= turn;
                    } else {
                        System.out.println("Aayush");
                        break;
                    }
                }

                turn++;
            }
        }
    }
}

