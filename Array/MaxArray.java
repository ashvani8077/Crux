package Array;

public class MaxArray {
    static void main(String[] args) {
        int arr[]={2,3,1,51,7};
        System.out.println(max(arr));
    }

    public static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];
        }
        return max;
    }
}
