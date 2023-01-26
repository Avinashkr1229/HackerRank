import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int i=0;
        int count=1;
        int value=nums[0];
        while (count!=0){
            if(i== nums.length-1){
              return value;
            }
            else if(value==nums[i+1]){
                count++;
            }else {
                count--;
            }
            if(count==0){
                value=nums[i];
                count++;
            }
            i++;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{8,8,7,7,7}));
    }
}
