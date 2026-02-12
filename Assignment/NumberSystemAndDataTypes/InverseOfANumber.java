//https://hack.codingblocks.com/app/contests/9341/698/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class InverseOfANumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int c=1;
        while (n>0){
            int rem=n%10;
            ans=ans+(c++*(int)Math.pow(10,rem-1));
            n=n/10;
        }
        System.out.println(ans);
    }
}
