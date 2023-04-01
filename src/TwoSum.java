public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        while(i< nums.length-1){
            j++;
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            if(j==nums.length-1){
                i++;
                j=i;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] i=twoSum(new int[]{3,2,4},6);
        for(int k : i){
            System.out.println(k);
        }
    }
}

