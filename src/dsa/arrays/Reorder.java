package dsa.arrays;

public class Reorder {


    /*
    *
    * Time Complexity: O(n)
      Auxiliary Space: O(n)
* */
    static void reorder(int[] arr, int[] index, int n) {

        //using auxilary array
        int[] tempArray = arr.clone();
        for (int i = 0; i < index.length; i++) {
            arr[index[i]] = tempArray[i];
        }

        //cyclic sort
        int k = 0;
        while (k < n) {
            int correct = index[k];
            if (index[correct] != index[k])
                swap(index, correct, k);
            else
                k++;
        }

    }

    static void swap(int[] index, int left, int right) {
        int temp = index[left];
        index[left] = index[right];
        index[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {50, 40, 70, 60, 90};
        int[] index = {3, 0, 4, 1, 2};
        reorder(arr, index, arr.length);
    }
}
