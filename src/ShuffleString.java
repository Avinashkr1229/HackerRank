import java.util.Arrays;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        String str="";
        for(int i=0;i<indices.length;i++){
            str+=s.charAt(indices[i]);
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
    }
}
