import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>();
        AtomicInteger i = new AtomicInteger();
        h.forEach(s -> map.put((char) ('a' + i.getAndIncrement()), s));

        List<Integer> list = new ArrayList<>();
        word.chars().forEach(m-> list.add(map.get((char) m)));
        int n= list.stream().max(Comparator.naturalOrder()).get();
        return n*word.length();
    }

    public static void main(String[] args) {
        int x=designerPdfViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), "abc");
        System.out.println(x);
    }
}
