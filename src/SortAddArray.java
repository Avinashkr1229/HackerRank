public class SortAddArray {

    public static int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int i=0;
        int j=0;

        int even=0;
        int odd=1;

        while(i<nums.length){
            if(nums[i]%2==0){
                res[even]=nums[i];
                even+=1;
            }
            i++;
        }
        while(j<nums.length){
            if(nums[j]%2!=0){
                res[even]=nums[j];
                even+=1;
            }
            j++;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println( sortArrayByParity(new int[]{3,1,2,4}));
    }
}
