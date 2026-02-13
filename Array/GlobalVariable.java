package Array;

public class GlobalVariable {
    static  int val=100;

    static void main(String[] args) {
        System.out.println("Hey");
        int x=60;
        System.out.println(val);
        fun(x);
        System.out.println(val);
    }
    public static void fun(int x){
        int a=90;
        System.out.println(x);
        //int val=19;
        val=120;
        System.out.println(val);
    }
}
