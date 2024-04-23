package dsa.arrays;

public class moveZeroRight {

    //using swap method

    static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    static void partitionByswap(int[] arr, int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr, i, j);
                j++;
            }
        }

        for(int k : arr){
            System.out.println(k);
        }
    }
    static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while (count<n){
            arr[count++]=0;
        }

        for(int k : arr){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
//        int[] arr = {0 ,0 ,0 ,3 ,1 ,4};
//        int[] arr = {3, 5, 0, 0, 4};
        int [] arr = {0 ,0 ,0 ,3 ,1 ,4};
//        pushZerosToEnd(arr, arr.length);
        partitionByswap(arr, arr.length);
    }
}
