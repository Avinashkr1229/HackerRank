import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result =0;
        int []arr={4,1,2,1,2};
        for(int i:arr)
        {
            result =result^i;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
