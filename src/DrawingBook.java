public class DrawingBook {
    public static int pageCount(int n, int p) {
        int k = p / 2;
        int m = n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2;
        return Math.min(k, m);

    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
    }
}
