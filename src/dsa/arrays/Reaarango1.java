package dsa.arrays;

public class Reaarango1 {

    public static void alternatePosNeg(int[] arr, int n) {
        int[] negArr = arr.clone();
        int[] posArr = arr.clone();
        // code here
        int neg = 0;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                swap(negArr, i, neg);
                neg++;
            } else {
                swap(posArr, i, pos);
                pos++;
            }
        }

        int l = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            if(neg==n || pos==n){
              break;
            }
            else if (l > neg) {
                arr[i] = posArr[++m];
            } else if (m > pos) {
                arr[i] = negArr[++l];
            } else if (i % 2 == 0 && l<pos) {
                arr[i] = posArr[l++];
            } else {
                arr[i] = negArr[m++];
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {93 ,85 ,-59 ,45 ,-89 ,-41 ,-4 ,-98 ,79 ,-12};
        alternatePosNeg(arr, arr.length);
        for (int num : arr) {
            System.out.print(num + " "); // Output: 9 -2 4 -1 5 -5 0 -3 2
        }
    }
}
