package dsa.arrays;

import java.util.Arrays;

public class SegregateEvenOdd {

    //this is Lomutos algorithm
    static void lomutosPartition(int[] arr, int n){
        int i=-1;
        int j=0;
        while(j!=n){
            if(arr[j]%2==0){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        Arrays.sort(arr,0,i+1);
        Arrays.sort(arr,i+1,n);
    }

    static void segregateEvenOdd(int[] arr, int n) {
        // code here
        int[] tempArray = arr.clone();
        int count=0;
        int reverseCount=n-1;
        for(int i=0;i<n;i++){
            if(tempArray[i]%2==0){
                arr[count++]=tempArray[i];
            }else if(tempArray[i]%2!=0){
                arr[reverseCount--]=tempArray[i];
            }
        }

        Arrays.sort(arr,0,count);
        Arrays.sort(arr,count,n);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{449, 328, 474, 150, 709, 467, 329, 936, 440, 700, 117,
                258, 811, 952, 491, 993, 931, 823, 431,
                359, 590, 899, 153, 292, 370, 404, 698, 699,
                876, 442, 705, 757, 527, 868, 893, 642, 273, 18, 885, 675, 788, 291};

        segregateEvenOdd(arr, arr.length);
        for(int val : arr){
            System.out.println(val);
        }

        lomutosPartition(arr,arr.length);
    }
}
