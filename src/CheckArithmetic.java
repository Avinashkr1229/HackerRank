import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckArithmetic {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> response = new ArrayList<>();
        int sum=0;
        for(int i=0;i<l.length;i++){
            sum=0;
            int[] newArray = new int[r[i]-l[i]+1];
            int k=0;
            for(int j=l[i];j<=r[i];j++){
                sum+=nums[j];
                newArray[k]=nums[j];
                k++;
            }
            Arrays.sort(newArray);
            response.add(arithmeticProgression(newArray[0],r[i]-l[i]+1,newArray[1]-newArray[0],sum));
        }
        return response;
    }

    public static boolean arithmeticProgression(int a , int n, int d, int sum){
        double l = (double) 2*a+(n-1)*d;
        double m = (double) n/2;
        return l*m==sum;
    }
    public static void main(String[] args) {
        checkArithmeticSubarrays(new int[]{4,6,5,9,3,7},new int[]{0,0,2},new int[]{2,3,5});
    }
}
