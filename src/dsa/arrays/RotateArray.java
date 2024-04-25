package dsa.arrays;

public class RotateArray {
    static void reverseArray(int[] arr , int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    //Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int[] arr, int d, int n)
    {
        if(d==0)
            return;

        d=d%n;

        reverseArray(arr,0,d-1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr= {1 ,2 ,3 ,4 ,5};
        int d=2;
        rotateArr(arr,d, arr.length);
    }
}
