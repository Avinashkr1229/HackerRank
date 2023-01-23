public class MaxSubArraySum {
    public static int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here
                = 0;

        for (int num : nums) {
            max_ending_here = max_ending_here + num;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        System.out.println( maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
