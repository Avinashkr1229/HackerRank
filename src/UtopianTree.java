import java.util.Arrays;
import java.util.List;

public class UtopianTree {
    public static int utopianTree(int n) {
        // Write your code here
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum*=2;
            }else
                sum+=1;
        }
        return sum;
    }

    public static int gemstones(List<String> arr) {
        int[] frequency = new int[26];
        int count = 0;
        for(String str : arr){
            int[] rockFreq = new int[26];
            for(char i : str.toCharArray()){
                rockFreq[i-'a']=1;
            }
            for (int i = 0; i < 26; i++) {
                frequency[i]+=rockFreq[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if(frequency[i]==arr.size()){
                count++;
            }
        }
        return count;
    }

    public static int alternatingCharacters(String s) {
        // Write your code here
        int count=0;
        for (int i=0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       // gemstones(Arrays.asList("abcdde","baccd","eeabg"));
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
