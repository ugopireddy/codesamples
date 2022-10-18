public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("is valid anagram : " + isValidAnagram("anagram", "nagaram")  );
    }

    private static boolean isValidAnagram(String s, String t) {
        if( s.length() != t.length()) return false;

        int[] table = new int[26];

        for (char c : s.toCharArray()){
            table[c-'a']++;
        }
        for (char c : t.toCharArray()){
            table[c-'a']--;
        }
        for(int  i : table){
            if(i !=0 ) return false;
        }
        return true;
    }
}
