package Array;

public class ArraySwap2 {
    static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int other[]={100,200,300,400,500,600};
        int temp[]=arr;
        arr=other;
        other=temp;
        System.out.println(arr[0]);
        System.out.println(other[0]);

    }
}
