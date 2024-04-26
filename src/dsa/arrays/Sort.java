package dsa.arrays;

public class Sort {

    //cyclic sort
//    Time Complexity: O(n)
//    Auxiliary Space: O(1)

    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortMethod(int[] arr, int n){
        int i=0;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
        sortMethod(arr, arr.length);
    }
}
