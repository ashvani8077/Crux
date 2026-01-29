public class IncrementDecrement {
    static void main(String[] args) {
        int a=5;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        int b=10;
        System.out.println("B");
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);

        System.out.println("=============");
        a=9;
        b=8;
        int c=a++ - b++ - b-- + a++ + 8 + a++ - b++;
        System.out.println(c);

        System.out.println("=================");
        a=6;
        b=5;
        c=a++ + ++a - --b + ++b - b--;
        System.out.println(c);

    }
}
