//https://hack.codingblocks.com/app/contests/9341/64/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class CountDigits {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        while (n>0){
            if(n%10==n2)count++;
            n/=10;
        }
        System.out.println(count);
    }
}
