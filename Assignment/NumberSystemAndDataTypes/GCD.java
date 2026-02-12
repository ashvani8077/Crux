//https://hack.codingblocks.com/app/contests/9341/1040/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextLong();
        long n=sc.nextLong();
        long a=Math.max(m,n);
        long b=Math.min(m,n);
        long ans=1;
        for(long i=b;i>=1;i--){
           if(a%i==0&&b%i==0){
               ans=i;
               break;
           }
        }
        System.out.println(ans);
    }

}
