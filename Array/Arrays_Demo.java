package Array;

public class Arrays_Demo {
    static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;

        System.out.println("=====");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        int other[]=arr;
        other[0]=10;
        System.out.println(arr[0]);
        System.out.println(other[0]) ;
    }
}
