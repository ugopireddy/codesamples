import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams
{
    public static void main(String[] args) {
        String[] strs = new String[]{"ate", "eat", "tea", "nat", "tan", "bat"};
        System.out.println("grouped Anagrams : "+ groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String current : strs){
            char[] chars = current.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}
