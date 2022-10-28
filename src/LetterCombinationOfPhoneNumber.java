import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        System.out.println("letter combination is : "+ letterCombination("23"));
    }

    private static List<String> letterCombination(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() ==0) return result;

        String[] mapping = {"0", "1", "abc","def", "ghi", "jkl","mno","pqrs","tuv", "wxyz"};

        letterCombinationRecursively(result, digits, "", 0, mapping);
        return result;
    }

    private static void letterCombinationRecursively(List<String> result, String digits, String current, int index, String[] mapping) {
        if(index == digits.length()){
            result.add( current);
            return;
        }
        String letters = mapping[digits.charAt(index)-'0'];
        for (int i=0; i<letters.length(); i++){
            letterCombinationRecursively(result, digits, current + letters.charAt(i), index+1,mapping);
        }
    }
}
