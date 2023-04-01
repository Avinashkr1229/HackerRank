public class SubSequence {
    public static boolean isSubsequence(String s, String t) {
        int[] array = new int[26];
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']=i+1;
        }

        int count=1;
        for(int i=0;i<t.length();i++){
            if(array[t.charAt(i)-'a']>0 && array[t.charAt(i)-'a']==count){
                count++;
            }
        }

        if(count-1==s.length()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        isSubsequence("abc","ahbgdc");
    }
}
