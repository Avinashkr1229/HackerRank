import java.util.Arrays;

public class TopKElement {

    public static int[] topKFrequent(int[] nums, int k) {
        int [] array = new int[nums.length];
        Arrays.sort(nums);
        int i=1;
        int max=nums[0];
        int j=0;
        int count=0;
        while(i<nums.length && j<nums.length){
            if(max==nums[i]){
                i++;
                continue;
            }else{
                array[j++]=max;
                max=nums[i];
            }
            i++;
        }
        return Arrays.copyOfRange(array,0,k);
    }
    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3},2);
    }
}
