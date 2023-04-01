import java.util.Arrays;

public class MinimumSum {

    public static int minimumSum(int num) {
        int length=String.valueOf(num).length();
        int[] nums = new int[length];
        int i=0;
        int number=num;
        int divisor = 1000;
        while(number>0){
            nums[i++]=number/divisor;
            number=number%divisor;
            divisor=divisor/10;
        }
        Arrays.sort(nums);
        int firstSum=0;
        int secondSum=0;
        int even=1;
        int odd=1;
        for (int j = 0; j < nums.length; j++) {
            if(j%2==0){
                firstSum+=nums[j]*Math.pow(10,even--);
            }else{
                secondSum+=nums[j]*Math.pow(10,odd--);
            }
        }
        return firstSum+secondSum;
    }
    public static void main(String[] args) {
        System.out.println(minimumSum(4009));
    }
}
