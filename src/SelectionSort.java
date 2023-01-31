public class SelectionSort {
    static void isSelectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
            System.out.println(array[i]);
        }

    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        isSelectionSort(new int[]{8, 7, 23, 1, 32, 15});
    }
}
