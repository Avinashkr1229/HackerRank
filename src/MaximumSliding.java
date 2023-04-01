public class MaximumSliding {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxArray = new int[nums.length];
        int len=nums.length/k;
        int max=0;
        int count=0;
        int iter=0;
        for(int i=0;i<nums.length;i++){
            if(iter>0 && iter%k==0){
                maxArray[count++]=max;
                iter=0;
                i=count-1;
            }else{
                iter++;
            }
            max=Math.max(max,nums[i]);
        }
        return maxArray;
    }

    public static void main(String[] args) {
        maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
    }
}
