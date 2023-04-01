import java.util.Arrays;

public class Duplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = nums.length==1?0:1;
        while (i < nums.length && j < nums.length) {
            if (i!=j && nums[i] == nums[j]) {
                if (j - i <= k)
                    return true;
                else {
                    i++;
                    j = i + 1;
                }
            } else if(j < nums.length-1){
                j++;
            }else {
                i++;
                j = i + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{4,1,2,3,1,5}, 3));
    }
}
