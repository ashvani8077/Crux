import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(number%2==0?"Even":"Odd");
    }
}
