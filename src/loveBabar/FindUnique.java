package loveBabar;

public class FindUnique {

    static void find(int[] array){
        int unique=0;
        for(int i : array){
            unique = unique ^ i;
        }
        System.out.println(unique);
    }
    public static void main(String[] args) {
        find(new int[]{1,2,2,3,3,4,4});
    }
}
