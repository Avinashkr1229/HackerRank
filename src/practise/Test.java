package practise;

public class Test {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int i = 1;

        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= col);

            System.out.println();
            i++;
        } while (i <= row);
    }
}
