package Patterns;

import java.util.Scanner;

public class Pattern16 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while (row<=2*n-1){
            int i=1;
            while (i<=space){
                System.out.print("   ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print(" * ");
                j++;
            }
            row++;
            System.out.println();
            if(row<=n){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
        }
    }
}
