import java.util.Arrays;

public class MaxCoinsArray {

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int sum=0;
        int low=0;
        int high=((low+piles.length)/3);
        while(low<=high && low<piles.length && high<piles.length){
            sum+=piles[low+1];
            low=high+1;
            high=high+2;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(maxCoins(new int[]{9,8,7,6,5,1,2,3,4}));
    }
}
