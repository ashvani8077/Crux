package CharacterAndASCIIValues;

public class CharDemo {
    static void main(String[] args) {
        char ch='a';
        char ch1='b';
        System.out.println(ch+ch1);
        int ch2=ch+ch1;
        char ch3=(char)(ch1+ch2);
        ch2=(char)ch2;
        System.out.println(ch2);
        System.out.println("==");
        ch1++;
        System.out.println(ch1);
        System.out.println(ch3);
    }
}
