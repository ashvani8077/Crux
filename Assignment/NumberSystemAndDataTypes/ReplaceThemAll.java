//https://hack.codingblocks.com/app/contests/9341/161/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class ReplaceThemAll {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        if(n==0){
            System.out.println(5);
        }
        else{
            while (temp>0){
                int rem=temp%10;
                if(rem==0)rem=5;
                rev=rev*10+rem;
                temp/=10;
            }
            int ans=0;
            while (rev>0){
                ans=ans*10+(rev%10);
                rev/=10;
            }
            System.out.println(ans);
        }
    }
}
