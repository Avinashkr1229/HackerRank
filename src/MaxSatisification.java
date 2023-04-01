import java.util.Arrays;

public class MaxSatisification {
    public static int maxSatisfaction(int[] A) {
        Arrays.sort(A);
        int res = 0, total = 0, n = A.length;
        for (int i = n - 1; i >= 0 && A[i] > -total; --i) {
            total += A[i];
            res += total;
        }
        return res;
    }

    public static void main(String[] args) {
        maxSatisfaction(new int[]{-1,-8,0,5,-9});
    }
}
