package dsa.arrays;

import java.util.ArrayList;

public class SubarraySum {


    public static ArrayList<Integer> subArraySum(int[] arr, int n, int s){

        int left=0;
        int right =0;
        int sum=0;

        int start=-1;
        while(right<n){
            if (s == 0) {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 0) {
                        start=i+1;
                        break;
                    }
                }
                if(start>-1){
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(start);
                    result.add(start);
                    return result;
                }else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(-1);
                    return list;
                }
            }

            sum+=arr[right];
            while(sum>s){
                sum-=arr[left];
                left++;
            }

            if(sum==s){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(left+1);
                list.add(right+1);
                return list;
            }
            right++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7};
        System.out.println(subArraySum(arr, arr.length, 12));
    }
}
