import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit ball flew after it was hit";
        String[] banned = new String[]{"hit"};
        System.out.println("Most Common word in Paragraph is : "+ mostCommonWord(paragraph, banned));
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> ban = new HashSet<>();
        for (String s : banned) ban.add(s);

        Map<String, Integer> map = new HashMap<>();

        for (String word : paragraph.replaceAll("^[a-zA-Z]", " ").toLowerCase().split(" ")){
            if(!ban.contains(word)){
                map.put(word.trim(), map.getOrDefault(word,0) + 1);
            }
        }
        map.remove("");
        String result="";
        for (String key : map.keySet()){
            if(result.equals("") || map.get(key) > map.get(result)) result =key;
        }
        return result;
    }
}
