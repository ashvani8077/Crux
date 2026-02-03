package Loops;

import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=Math.max(a,b);
        int n=Math.min(a,b);
        int ans=-1;
        while (m%n!=0){
                int rem=m%n;
                m=n;
                n=rem;
        }
        System.out.println(n);
    }
}
