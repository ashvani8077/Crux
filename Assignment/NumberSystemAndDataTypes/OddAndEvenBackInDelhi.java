//https://hack.codingblocks.com/app/contests/9341/853/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class OddAndEvenBackInDelhi {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            int e=0;
            int o=0;
            while (num>0){
                if(num%10%2==0)e+=num%10;
                else o+=num%10;
                num/=10;
            }
            if(o%3==0&&e%4==0)System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
