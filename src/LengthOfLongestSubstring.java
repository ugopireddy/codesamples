import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int len = lengthOfLongestSubstring(str);
        System.out.println("lengthOfLongestSubstring : " + len);
    }

    private static int lengthOfLongestSubstring(String str) {
        Map<Character,Integer> map = new HashMap<>();
        int max=0, start =0;
        for (int i =0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                start = Math.max(start,    map.get(str.charAt(i)) + 1);
            }
            map.put(str.charAt(i), i);
            max = Math.max(max, i-start+1);
        }
        return max;
    }
}
