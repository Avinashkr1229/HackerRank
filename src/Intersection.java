import java.util.*;
import java.util.stream.Collectors;

public class Intersection {

    public static int[] intersection(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(map.containsKey(nums1[i])){
                    map.put(nums1[i],map.get(nums1[i])+1);
                }else
                    map.put(nums1[i],1);
            }
            if(j==nums2.length-1){
                j=-1;
                i=i+1;
            }
            j++;
        }
        map.entrySet().stream().forEach(s-> System.out.println(s.getKey()));
        return list.stream().mapToInt(k -> k).toArray();
    }
    public static void main(String[] args) {
        intersection(new int[]{1,2,2,1},new int[]{1,2});
    }
}
