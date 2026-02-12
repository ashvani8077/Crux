package Assignment.NumberSystemAndDataTypes;

import java.util.Scanner;

public class PrintAllArmstrongNumbers {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int st=sc.nextInt();
        int en=sc.nextInt();
        for (int i=st;i<=en;i++){
            int digit=0;
            int temp=i;
            while (temp>0){
                digit++;
                temp/=10;
            }
            int ans=0;
            temp=i;
            while (temp>0){
                int rem=temp%10;
                ans+=(int)Math.pow(rem,digit);
                temp/=10;
            }
            if(ans==i) System.out.println(ans);
        }

    }
}
