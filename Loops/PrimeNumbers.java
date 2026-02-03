package Loops;

import java.util.Scanner;

public class PrimeNumbers {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime?"Prime":"Not Prime");
        System.out.println(prime);
    }
}
