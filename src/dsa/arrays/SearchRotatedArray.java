package dsa.arrays;

public class SearchRotatedArray {

    static int findPivot(int[] arr, int l, int h) {
        if (h < l)
            return -1;
        if (arr[h] == arr[l])
            return l;
        int mid = (l + h) / 2;
        if (mid < h && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > l && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[l] >= arr[mid]) {
            return findPivot(arr, l, mid - 1);
        }
        return findPivot(arr, mid + 1, h);
    }

    static int binarySearch(int[] arr, int low, int high,
                            int key) {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    static int search(int[] A, int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int pivot = findPivot(A,l,h);
        if(pivot==-1){
            return binarySearch(A, 0, h, key);
        }

        if(A[pivot]==key){
            return pivot;
        }

        if(A[0]<=key){
            return binarySearch(A, 0, pivot-1, key);
        }else{
            return binarySearch(A, pivot+1, h, key);
        }
    }

    public static void main(String[] args) {
        int[] A = {5 ,6 ,7 ,1 ,2 ,3 ,4};
        System.out.println(search(A, 0, A.length - 1, 1));
    }
}
