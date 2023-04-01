import java.util.ArrayList;
import java.util.List;

public class DecodeXOR {

    public static int[] decode(int[] encoded, int first) {
        int arr[]=new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        decode(new int[]{1,2,3},1);
    }
}
