import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println("sorted string by frequency: "+ frequencySort("tree"));
    }

    private static String frequencySort(String tree) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : tree.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }
        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        maxheap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();

        while(!maxheap.isEmpty()){
            char cur = maxheap.remove();
            for(int i=0; i< map.get(cur); i++){
                result.append(cur);
            }
        }
        return result.toString();
    }
}
