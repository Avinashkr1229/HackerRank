package dsa.arrays;


/*Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

        Example 1:

Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1,
        second max = 5, second min = 2, and
so on... Modified array is : 6 1 5 2 4 3.*/

//chat gpt answer please think your perspective
public class Rearrange {
    public static void rearrange(long arr[], int n){
        int maxIdx = n - 1;
        int minIdx = 0;
        long maxElement = arr[maxIdx] + 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElement) * maxElement;
                maxIdx--;
            }
            else {
                arr[i] += (arr[minIdx] % maxElement) * maxElement;
                minIdx++;
            }
        }

        for (int i = 0; i < n; i++)
            arr[i] /= maxElement;
    }

    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
        rearrange(arr, arr.length);
    }
}
