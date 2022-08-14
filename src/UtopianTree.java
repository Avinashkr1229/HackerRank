public class UtopianTree {
    public static int utopianTree(int n) {
        // Write your code here
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum*=2;
            }else
                sum+=1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(1));
    }
}
