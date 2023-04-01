import java.util.Arrays;
import java.util.List;

public class ConnectedCell {
    public static int connectedCell(List<List<Integer>> matrix) {
        for (int i=0;i< matrix.size();i++){
           System.out.println(matrix.get(i));
        }
        return 0;
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix =
                Arrays.asList(Arrays.asList(1, 1, 0, 0)
                ,Arrays.asList(0, 1, 1, 0)
                ,Arrays.asList(0, 0, 1, 0)
                ,Arrays.asList(1, 0, 0, 0));
        int result = connectedCell(matrix);
    }
}
