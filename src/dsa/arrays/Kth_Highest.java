package dsa.arrays;

import java.util.PriorityQueue;

public class Kth_Highest {

    static int getByQueue(int[] nums,int k){
        PriorityQueue<Integer> integers = new PriorityQueue<>(k);
        for (int i : nums) {
            if(integers.size()<k){
                integers.offer(i);
            }else if(i>integers.peek()){
                integers.poll();
                integers.offer(i);
            }
        }
        return integers.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        getByQueue(nums,k);
    }
}
