import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCDEFGHI";
        String rev = reverseString(str);
        System.out.println("reverese string : "+ rev);
    }

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start =0;
        int end = charArray.length-1;

        while(start<end){
            char tmp = charArray[end];
            charArray[end] = charArray[start];
            charArray[start] = tmp;
            start++;
            end--;
        }
        return Arrays.toString(charArray);
    }

    private static String reverseString1(String str) {
        StringBuilder rev = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}
