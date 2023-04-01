package practise;

public class Eqilibrium {

    public static int isEqui(int[] array){
        int low=0;
        int high=array.length-1;
        int leftSum;
        int rightSum;
        int next;
        int before;
        while(low<high){
            next=low+1;
            before=high-1;
            leftSum=array[low]+array[next];
            rightSum=array[high]+array[before];
            if(leftSum==rightSum){
                return array[next+1];
            }
            low++;
            high--;

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(isEqui(new int[]{1,4,2,5,0}));
    }
}
