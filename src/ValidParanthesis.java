import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "{}[]{}";
        boolean isValid = isValidParanthesis(str);
        System.out.println("isValidParanthesis : "+ isValid);
    }

    private static boolean isValidParanthesis(String str) {
        if(str == null) return true;
        if(str.length() % 2 == 1) return  false;

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
