package loveBabar;

import java.util.Arrays;

public class swapAlternate {

    public static void swap(int[] nums) {
        for(int i=0;i<nums.length; i+=2){
            if(i+1<nums.length){
                int temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        swap(new int[]{2, 3, 4, 5, 6, 7});
    }
}
