package Array;

import java.util.Scanner;

public class ArraySwap {
    static void main(String[] args) {
        int arr[]={10,20,5,7,8};
        swap(0,1,arr);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void swap(int a, int b, int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
