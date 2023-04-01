import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {
        int p=0;
        List<int[]> list = new ArrayList<>();
        int[] arr= new int[2];
        int[][] array= new int[intervals.length][2];
        for(int i=1;i<=intervals.length-1;i++){
            Arrays.sort(intervals[p]);
            Arrays.sort(intervals[i]);

            if(intervals[p][1]>intervals[i][0]){
                arr[0]=intervals[p][0];
                arr[1]=intervals[i][1];
                list.add(arr);
                i++;
                p++;
            }else{
                list.add(intervals[p]);
                list.add(intervals[i]);
            }
            p++;
        }

        return list.stream().map(s-> Arrays.stream(s).toArray()).toArray(int[][]::new);
    }
    public static void main(String[] args) {
        int[][] array = merge(new int[][]{{1,4},{0,4}});

    }
}
