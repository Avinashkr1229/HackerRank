package dsa.arrays;

public class SecondLarget {

    static int findSecondLargest(int[] arr, int n){
        int first, second;
        if(arr.length<3){
            return -1;
        }
        first=second= Integer.MIN_VALUE;
        for(int value : arr){
            if(value>first){
                second = first;
                first = value;
            } else if (value>second && value!=first) {
                second = value;
            }
        }
        if(second==Integer.MIN_VALUE){
            return -1;
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargest(arr, arr.length));
    }
}
