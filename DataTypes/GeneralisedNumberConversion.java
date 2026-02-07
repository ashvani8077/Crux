package DataTypes;

import java.util.Scanner;

public class GeneralisedNumberConversion {

    static void main(String[] args) {
        //let source and destination some values
        int source=1;
        int destination=2;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int multiplier=1;
        while (n>0){
            int rem=n%source;
            sum=sum+rem*multiplier;
            multiplier=multiplier*source;
            n=n/destination;
        }
    }
}
