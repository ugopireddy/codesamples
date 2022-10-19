public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean isValid = isValidPalindrome (str);
        System.out.println("is valid Palindrome : "+ isValid);
    }

    private static boolean isValidPalindrome(String str) {
        if(str.isEmpty()) return true;
        int head =0, tail = str.length()-1;
        char cHead, cTail;
        while (head <= tail) {
            cHead = str.charAt(head);
            cTail = str.charAt(tail);
            if(!Character.isLetterOrDigit(cHead)){
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else{
                if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
