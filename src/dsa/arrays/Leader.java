package dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leader {
    static ArrayList<Integer> leaders(int arr[], int n){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=stack.peek()){
                stack.push(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr, arr.length));
    }
}
