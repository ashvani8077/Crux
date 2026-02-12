//https://hack.codingblocks.com/app/contests/9341/100/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class PrintReverse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while (n>0){
            ans=ans*10+(n%10);
            n/=10;

        }
        System.out.println(ans);
    }
}
