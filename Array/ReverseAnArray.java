package Array;

import java.util.Arrays;

public class ReverseAnArray {
    static void main(String[] args) {
        int arr[]={1,2,3,5,7,9,11};
        int l=0;
        int r=arr.length-1;
        while (l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String s= Arrays.toString(arr);
        System.out.println(s);
    }
}
