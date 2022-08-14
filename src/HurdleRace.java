import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = height.stream().sorted(Collections.reverseOrder()).findFirst().get();
        return k > max ? 0 : max - k;
    }

    public static void main(String[] args) {
        hurdleRace(7, Arrays.asList(2 ,5 ,4 ,5 ,2));
    }
}
