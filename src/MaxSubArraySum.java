public class MaxSubArraySum {
    public static int maxSubArray(int[] nums) {
        int start = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum = sum + num;
            if (start < sum)
                start = sum;
            if (sum < 0)
                sum = 0;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println( maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
