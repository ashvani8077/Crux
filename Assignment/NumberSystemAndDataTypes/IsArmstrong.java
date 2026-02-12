//https://hack.codingblocks.com/app/contests/9341/1102/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class IsArmstrong {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int digit=0;
        while (temp>0){
            digit++;
            temp/=10;
        }
        int ans=0;
        temp=n;
        while (temp>0){
            int rem=temp%10;
            ans+=(int)Math.pow(rem,digit);
            temp/=10;
        }
        if(ans==n)System.out.println(true);
        else System.out.println(false);
    }
}
