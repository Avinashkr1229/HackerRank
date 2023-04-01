public class MatchString {
    public static int strStr(String haystack, String needle) {
        int high=0;
        String key ="";
        String largest="";
        int low=0;
        if(haystack.length()>=needle.length()){
            high=haystack.length()-1;
            low=needle.length();
            key = needle;
            largest=haystack;
        }else{
            high=needle.length()-1;
            low=haystack.length();
            key = haystack;
            largest= needle;
        }
        int i=0;
        while(i<high){
            if(low>high){
                return -1;
            }
            if(low< high && largest.substring(i,low).equals(key)){
                return i;
            }else{
                i=low;
                low=i+low;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
