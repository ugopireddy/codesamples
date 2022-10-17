import java.util.*;
public class WordSubsets {

    public static void main(String[] args){
        String[] A = {"google", "leetcode", "apple"};
        String[] B = {"le","o"};

        List<String> universalStrings = wordSubsets(A, B);

        System.out.println(universalStrings);
    }

    private static List<String> wordSubsets(String[] a, String[] b) {
        List<String> output = new ArrayList<>();
        int[] maxFreq = new int[26];
        for (String str : b){
            int[] cur = new int[26];
            for(char c : str.toCharArray()){
                cur[c - 'a']++;
            }
            for (int i=0; i<26; i++){
                maxFreq[i] = Math.max(maxFreq[i], cur[i]);
            }
        }
        for (String s : a) {
            int[] cur = new int [26];
            for (char c : s.toCharArray()){
                cur[c - 'a']++;
            }
            for (int i=0; i<26; i++){
                if (maxFreq[i] > cur [i]) {
                    break;
                }
                if(i == 25){
                    output.add(s);
                }
            }
        }
        return output;
    }
}
