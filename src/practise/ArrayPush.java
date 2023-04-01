package practise;

public class ArrayPush {

    public static int[] getConcatenation(int[] nums) {
        int i=0;
        int k = nums.length;
        int ans[] = new int[k*2];
        int count=0;
        int l=0;
        while(i<k*2){
            if(i!=0 && i%k==0){
                i=0;
                count++;
            }
            if(count==2){
                break;
            }
            ans[l]=nums[i];
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        getConcatenation(new int[]{1,2,1});
    }
}
