import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(8), new TreeNode(9))), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println("Binary tree before in order traversal" + t1.toString());
        List<Integer> output = new ArrayList<>();
        iterativeInorderTraversal(t1, output);
        //[4, 2, 8, 5, 9, 1, 6, 3, 7]
        System.out.println("Binary tree after in order traversal  : " + output.toString());
    }

    private static void iterativeInorderTraversal(TreeNode node, List<Integer> output) {
        if (node == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while( node != null || !stack.isEmpty()){
            if(node != null){
                stack.add(node);
                node = node.left;
            }else{
                node = stack.pop();
                output.add(node.val);
                node = node.right;
            }

        }

    }

    private static void recursiveInorderTraversal(TreeNode root, List<Integer> output) {
        if(root ==null) return;
        recursiveInorderTraversal(root.left, output);
        output.add(root.val);
        recursiveInorderTraversal(root.right, output);
    }
}
