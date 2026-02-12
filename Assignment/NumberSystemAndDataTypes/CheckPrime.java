//https://hack.codingblocks.com/app/contests/9341/919/problem
package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class CheckPrime {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
