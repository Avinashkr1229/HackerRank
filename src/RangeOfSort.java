import java.util.Arrays;

public class RangeOfSort {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int sum=0;
        int last=nums[n-1];
        int first=nums[0];
        int i=0;
        int length= n*(n+1)/2;
        int[] array = new int[length];
        int j=0;
        int k=1;
        while(first!=last){
            sum+=nums[i];
            array[j]=sum;
            if(i==n-1){
                i=k++;
                first=nums[k-1];
                sum=0;
            }else{
                i++;
            }
            j++;
        }
        array[j]=last;
        Arrays.sort(array);

        int max=0;
        for (int l = left-1; l <=last; l++) {
            max+=array[l];
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println( rangeSum(new int[]{7,5,8,5,6,4,3,3},8,2,6));
    }
}
