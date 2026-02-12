//https://hack.codingblocks.com/app/contests/9341/184/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class BinaryToDecimal {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int mul=1;
        while (n>0){
            int rem=n%10;
            ans=ans+mul*rem;
            mul=mul*2;
            n/=10;
        }
        System.out.println(ans);
    }
}
