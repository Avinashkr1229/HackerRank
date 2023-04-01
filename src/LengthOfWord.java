public class LengthOfWord {
    public static int lengthOfLastWord(String s) {
        int length=s.trim().length()-1;
        char[] array= s.trim().toCharArray();
        int count=0;
        for(int i=length; i>=0 ; i--){
            if(array[i]!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
