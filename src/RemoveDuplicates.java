import java.util.Iterator;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates abbaca " + removeDuplicates("abbaca"));
    }

    private static String removeDuplicates(String input) {
        StringBuilder output= new StringBuilder();
        Stack<Character> s = new Stack<>();
        for (char c : input.toCharArray()){
            if(!s.isEmpty() && s.peek() == c){
                s.pop();
            }else {
                s.push(c);
            }
        }
        Iterator i = s.iterator();
        while(i.hasNext()){
            output = output .append( i.next());
        }

        return output.toString();
    }
}
