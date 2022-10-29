import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class NaryTreePostorderTraversal {


    public static void main(String[] args) {
        Node node2 = new Node(2), node4 = new Node(4), node5 = new Node(5), node6 = new Node(6);
        List<Node> children3 = new ArrayList<>();
        children3.add(node5);
        children3.add(node6);
        Node node3 = new Node(3, children3);
        List<Node> children1 = new ArrayList<>();
        children1.add(node3);
        children1.add(node2);
        children1.add(node4);
        //root = [1,null,3,2,4,null,5,6]
        Node root = new Node(1, children1);
        System.out.println("Nary tree before post Order traversal : " + root.toString());
        List<Integer> output = new ArrayList<>();
        iterativePostorderTraversal(output, root);
        //Output: [5,6,3,2,4,1]
        System.out.println("Nary tree After post Order traversal : " + output.toString());

    }

    private static void iterativePostorderTraversal(List<Integer> output, Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            root = stack.pop();
            output.add(0,root.val);
            for (Node node : root.children){
                stack.add(node);
            }
        }
    }

    private static List<Integer> recursivePostorderTraversal(List<Integer> output, Node root) {

        if (root == null) return output;

        for (Node node : root.children) {
            recursivePostorderTraversal(output, node);
        }

        output.add(root.val);

        return output;
    }
}
