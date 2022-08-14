public class CatAndMouse {
    static String catAndMouseSolution(int x, int y, int z) {
        String res = "";
        System.out.println("hi");
        try {
            if (z < x) {
                x = x - z;
            } else {
                x = z - x;
            }

            if (z < y) {
                y = y - z;
            } else {
                y = z - y;
            }
            System.out.println(x+" "+y);
            if (x < y) {
                res = "Cat A";
            } else if (x == y) {
                res = "Mouse C";
            } else
                res = "Mouse B";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args) {
        catAndMouseSolution(1, 2, 3);
    }
}
