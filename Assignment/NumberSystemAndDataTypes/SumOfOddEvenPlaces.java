//https://hack.codingblocks.com/app/contests/9341/25/problem

package Assignment.NumberSystemAndDataTypes;
import java.util.Scanner;
public class SumOfOddEvenPlaces {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int eve=0;
        int odd=0;
        int counter=1;
        while(n>0){
            int rem=n%10;
            if(counter%2==0)eve+=rem;
            else odd+=rem;
            n/=10;
            counter++;
        }
        System.out.println(odd);
        System.out.println(eve);

    }
}