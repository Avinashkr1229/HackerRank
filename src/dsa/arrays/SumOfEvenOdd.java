package dsa.arrays;

public class SumOfEvenOdd {

    static void sumEvOd(int n){
        int evenSum=0;
        int oddSum=0;
        int remainder=0;
        while(n>0){
            remainder = n%10;
            if(remainder%2==0)
                evenSum+=remainder;
            else
                oddSum+=remainder;
            n/=10;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
    public static void main(String[] args) {
        int number=54873;
        sumEvOd(number);
    }
}
