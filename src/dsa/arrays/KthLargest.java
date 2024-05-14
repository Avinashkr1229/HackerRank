package dsa.arrays;
/*You are given an array Arr of size N. You have to find the K-th largest sum of contiguous subarray
within the array elements. In other words, over all subarrays, find the subarray with k-th largest
sum and return its sum of elements.

Example 1:

Input:
N = 3
K = 2
Arr = {3,2,1}
Output:
5
Explanation:
The different subarray sums we can get from the array
are = {6,5,3,2,1}. Where 5 is the 2nd largest.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargest {

    /*Time Complexity: O(n2*log(n2))
      Auxiliary Space: O(n)*/
    static int getBrutforeceMethod(int N, int K, int[] Arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i< N; i++){
            int sum =0;
            for (int j = i; j < N; j++) {
                sum+=Arr[j];
                arrayList.add(sum);
            }
        }
        arrayList.sort(Collections.reverseOrder());
        return arrayList.get(K-1);
    }

    static int getByPrefixSum(int N, int K, int[] Arr){
        List<Integer> prefixSum = new ArrayList<>(N+1);
        prefixSum.add(0);
        for(int i=1;i<=N;i++){
            prefixSum.add(prefixSum.get(i-1)+Arr[i-1]);
        }

        List<Integer> subArraySum = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            for (int j = i+1; j <=N ; j++) {
                subArraySum.add(prefixSum.get(j)-prefixSum.get(i));
            }
        }

        Collections.sort(subArraySum,Collections.reverseOrder());
        return subArraySum.get(K-1);
    }


    public static void main(String[] args) {
        int[] Arr = {3,2,1};
        System.out.println(getBrutforeceMethod(Arr.length, 2, Arr));
        System.out.println(getByPrefixSum(Arr.length, 2, Arr));
    }
}
