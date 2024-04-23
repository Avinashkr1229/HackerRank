package dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReEvenPosGrtOdd {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    static ArrayList<Integer> assign(int a[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(i%2==0 && a[i]>a[i-1]){
                swap(a,i,i-1);
            }else if(i%2!=0 && a[i]<a[i-1]){
                swap(a,i,i-1);
            }
        }
        for(int k: a){
            list.add(k);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2};
        System.out.println(assign(a,a.length));
    }
}
