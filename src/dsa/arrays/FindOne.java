package dsa.arrays;

public class FindOne {

    /*Time Complexcity : O(n)
    * Space Complexcity : O(1)
    * */
    static int findOnce(int[] arr, int n) {
        int res = arr[0];
        for (int i=1;i<n;i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    /*Time Complexcity : O(nlogn)
     * Space Complexcity : O(1)
     * */
    static int binarySearch(int[] arr, int low, int high){
        while (low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==arr[mid^1]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return arr[low];
    }

    static int findOnceBinary(int[] arr, int n){
        return binarySearch(arr,0,n-2);
    }

    public static void main(String[] args) {
        int[] arr= {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
//        System.out.println(findOnce(arr, arr.length));

        findOnceBinary(arr, arr.length);
    }
}
