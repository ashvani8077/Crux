import java.util.Scanner;

public class VoteEligibility {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(age>=18?"Eligible":"Not Eligible");
    }
}
