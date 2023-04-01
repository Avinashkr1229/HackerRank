import java.util.*;
import java.util.stream.Collectors;

public class DeleteAndEarn {
    public static int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        for (int i : nums){
            map.compute(i,(k,v)->v==null?1:v+1);
            min = Math.min(min,i);
            max = Math.max(max,i);
        }

        System.out.println(map);

        return 0;
    }

    public static void main(String[] args) {
       // deleteAndEarn(new int[]{2,2,3,3,3,4});

        char a = 'a'+0;
        String str = a+"";
        System.out.println(str);
    }
}
