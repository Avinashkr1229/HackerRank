package dsa.arrays;

public class LargestThree {

    public static void first3largest(int[] array){
        int  first,second, third;
        if(array.length<3){
            System.out.println("Invalid input");
        }

        first=second=third=Integer.MIN_VALUE;
        for (int j : array) {
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j > second) {
                third = second;
                second = j;
            } else if (j > third) {
                third = j;
            }
        }

        System.out.println("first:"+first+"\n"+"second:"+second+"\n"+"third:"+third);

    }
    public static void main(String[] args) {
        first3largest(new int[]{12, 13, 1, 10, 34, 1});
    }
}
