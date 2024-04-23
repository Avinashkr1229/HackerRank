package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {

    public static boolean palind(String str){
        int length = str.length();
        for(int i=0;i<length;i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean removeWhiteSpaces(String str){
        char[] array = str.toCharArray();
        for(Character c : array){
            if(Character.isWhitespace(c)){
                return false;
            }
        }
        return true;
    }

    public static void duplicateCharacter(String str){
        System.out.println(str.chars().mapToObj(character->(char) character)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }

    public static void repeatingWord(String str){
        Map<String, Long> wordCounts = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        // Print the word counts
        System.out.println(wordCounts);
        wordCounts.entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        String str = "madam";
        String s = palind(str) ? "Palindrome" : "Not a plaindrome";
        System.out.println(s);

        s=removeWhiteSpaces(str) ? "No WhiteSpace":"whitespace";
        System.out.println(s);

        str = " avinash \t";
        System.out.println(str.strip());

        str ="manojpandey";
        duplicateCharacter(str);

        str = "I am a java developer and I am proud of it";
        repeatingWord(str);

        int[] array = {5, 2, 9, 1, 7, 3, 8};

        System.out.println(Arrays.stream(array).boxed().sorted((a,b)->b-a).distinct().skip(1).findFirst().get());
    }


}
