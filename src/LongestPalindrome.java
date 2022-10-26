import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abbccdd";
        //int len = longestPalindrome(str);
       // System.out.println("longest palindrome len: "+ len);

        String result = longestPalindrome2(str);
        System.out.println("longestPalindrome : "+result);

    }

    private static int longestPalindrome(String str) {
        Set<Character> set = new HashSet<>();
        int pairs=0;
        for (char c:str.toCharArray()) {
            if(set.contains(c)){
                pairs++;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        pairs = pairs * 2;
        if(!set.isEmpty()) pairs++;
        return pairs;
    }
    private static String longestPalindrome2(String s){
        int n = s.length();
        int palindromeStartsAt =0, maxLength = 0;
        boolean dp[][] = new boolean[n][n]; // dp[i][j] indicates whether substring s starting at index i and ending at j is palindrome

        for (int i=n-1; i>=0; i--){ // keep increasing the possible palindrome string
            for (int j=i; j<n; j++){ // find the max palindrome within this window of (i,j)
                //check if substring between (i,j) is palindrome
                dp[i][j] = (s.charAt(i)==s.charAt(j) ) // chars at i and j should match
                        &&  (j-i < 3  // if window is less than or equal to 3, just end chars should match
                        || dp[i+1][j-1] ); //if window is > 3, substring (i+1, j-1) should be palindrome too

                //update max palindrome string
                if(dp[i][j] && (j-i+1 > maxLength)){
                    palindromeStartsAt = i;
                    maxLength = j-i+1;

                }
            }
        }
        return s.substring(palindromeStartsAt, palindromeStartsAt + maxLength);

    }

}
