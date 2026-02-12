//https://hack.codingblocks.com/app/contests/9341/206/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class SimpleInput {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while (true){
            int r=sc.nextInt();
            n+=r;
            if(n>=0){
                System.out.println(r);
            }
            else {
                break;
            }
        }
    }
}
