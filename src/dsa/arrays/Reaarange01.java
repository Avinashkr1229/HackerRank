package dsa.arrays;


// arr: input array
// n: size of array
//Function to rearrange an array so that arr[i] becomes arr[arr[i]]
//with O(1) extra space.
public class Reaarange01 {

    static void rearrange(long[] arr, int n){
        for(int i=0;i<n;i++){
            arr[i]+=(arr[(int) arr[i]]%n)*n;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]/n);
        }
    }
    public static void main(String[] args) {
        long[] arr = {4,0,2,1,3};
        rearrange(arr, arr.length);
    }
}
