package Patterns;

import java.util.Scanner;

public class Pattern13 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while (row<=n){
            int i=1;
            while (i<=star){
                System.out.print(" * ");
                i++;
            }
            int j=1;
            while (j<=space){
                System.out.print("   ");
                j++;
            }
            int k=1;
            if(row==1)k=2;
            while (k<=star){
                System.out.print(" * ");
                k++;
            }
            star--;
            if(row==1){
                space+=1;
            }
            else{
                space+=2;
            }
            row++;
            System.out.println();
        }
    }
}
