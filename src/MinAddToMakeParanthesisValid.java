import java.util.Stack;

public class MinAddToMakeParanthesisValid {
    public static void main(String[] args) {
        String str = "(()(";
        int count = minAddToMakeValid2(str);
        System.out.println("minAddToMakeValid : " + count);
    }

    private static int minAddToMakeValid2(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray()){
            if (c == '('){
                stack.push(c);
            } else if( !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }

    private static int minAddToMakeValid(String str) {
        int left = 0, right =0;
        for (char c: str.toCharArray()) {
            if( c == '('){
                right ++;
            } else if( right > 0){
                right --;
            } else {
                left ++;
            }
        }
        return left + right;
    }
}
