import java.util.*;

public class CommonCharcter {

    public static List<String> commonChars(String[] words) {
        int[] array = new int[26];
        List<String> res = new ArrayList<>();
        List<Map<Character,Integer>> list = new ArrayList<>();
        for(String str : words){
            Map<Character,Integer> map = new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }else{
                    map.put(str.charAt(i),1);
                }
            }
            list.add(map);
        }

        String checkString=words[0];
        int start = 0;
        int count=0;
        for(int i=0;i<checkString.length();i++){
            count=0;
            start = list.get(0).containsKey(checkString.charAt(i))
                    ?list.get(0).get(checkString.charAt(i)):0;
            for(int j=1;j< list.size(); j++){
                if(list.get(j).containsKey(checkString.charAt(i)) && list.get(j).get(checkString.charAt(i))==start){
                    count++;
                }
            }
            if(count+1==words.length){
                res.add(checkString.charAt(i)+"");
            }
        }


        return res;
    }
    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"cool","lock","cook"}));
    }
}
