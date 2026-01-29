import java.util.Scanner;

public class WhileLoopSum {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1;
        int sum=0;
        while (a<=10){
            sum=sum+a;
            a++;
        }
        System.out.println(sum);
    }
}
