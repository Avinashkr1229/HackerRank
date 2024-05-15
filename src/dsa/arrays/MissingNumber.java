package dsa.arrays;

public class MissingNumber {

    /*
    * Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n.
    * Find the smallest number that is missing from the array.
    *
    * */
    static int missingNum(int[] arr,int start, int high){
       if(start> high)
           return high+1;

       if(start!=arr[start])
           return start;

       int mid = (start+high)/2;

       if(arr[mid]==mid)
           return missingNum(arr,mid+1,high);

       return missingNum(arr, start,mid-1);
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println(missingNum(arr,0,arr.length));;
    }
}
