package dsa.arrays;

public class RotateCount {
    static int findPivot(int[] arr, int low, int high){
        if(high<low)
            return -1;
        int mid =(low+high)/2;
        if(mid<high && arr[mid]>arr[mid+1])
            return mid;
        if(mid>low && arr[mid]<arr[mid-1])
            return mid-1;
        if(arr[low]>=arr[mid])
            return findPivot(arr, low, mid-1);
        return findPivot(arr,mid+1,high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(findPivot(arr,0, arr.length-1)+1);
    }
}
