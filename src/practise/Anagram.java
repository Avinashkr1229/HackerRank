package practise;

public class Anagram {

    public static boolean isAnagram(String original, String jumbled){
        int[] array = new int[26];
        for(char a : original.toCharArray()){
            array[a-'a']++;
        }

        for(char b : jumbled.toCharArray()){
            array[b-'a']--;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
