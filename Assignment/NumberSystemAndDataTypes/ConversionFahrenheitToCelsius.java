//https://hack.codingblocks.com/app/contests/9341/560/problem

package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class ConversionFahrenheitToCelsius {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int step=sc.nextInt();
        for(int i=m;i<=n;i+=step){
            int a=(int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+a);
        }
    }
}
