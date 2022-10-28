import java.util.HashMap;

public class FirstUniqueCharIndex {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int index = firstUniqueChar(s);
        System.out.println("first unique char index : "+ index);
    }

    private static int firstUniqueChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for ( int i=0; i<s.length(); i++  ){
            char cur = s.charAt(i);
            if(!map.containsKey(cur)){
                map.put(cur, i);
            }else{
                map.put(cur, -1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (char c : map.keySet()){
            if(map.get(c) > -1 && map.get(c) < min){
                min = map.get(c);
            }
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}
