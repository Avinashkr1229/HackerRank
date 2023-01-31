public class BubbleSort {

    static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{8, 7, 23, 1, 32, 15};
        bubbleSort(array);
        for(int i : array){
            System.out.println(i);
        }
    }
}
