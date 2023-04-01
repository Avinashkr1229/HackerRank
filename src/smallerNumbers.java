import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class smallerNumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numsCopy=nums;
        nums=Arrays.stream(nums).sorted().toArray();
        int[] resp = new int[nums.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                continue;
            }else
                map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(numsCopy[i])!=null){
                resp[i]=map.get(numsCopy[i]);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        System.out.println(smallerNumbersThanCurrent(new int[]{6,3,7,6,9}));
    }
}
