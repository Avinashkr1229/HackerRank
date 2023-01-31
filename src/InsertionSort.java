public class InsertionSort {

    static int[] isInserstionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int number_to_inserted = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > number_to_inserted) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = number_to_inserted;
        }
        return array;
    }

    public static void main(String[] args) {
       int[] array =isInserstionSort(new int[]{8, 7, 23, 1, 32, 15});
       for(int i : array){
           System.out.println(i);
       }
    }
}
