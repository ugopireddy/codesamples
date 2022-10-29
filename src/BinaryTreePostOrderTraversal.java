import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(8), new TreeNode(9))), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println("Binary tree before post order traversal" + t1.toString());
        List<Integer> output = new ArrayList<>();
        recursivePostorderTraversal(t1, output);
        //[4, 8, 9, 5, 2, 6, 7, 3, 1]
        System.out.println("Binary tree after post order traversal  : " + output.toString());

    }

    private static void recursivePostorderTraversal(TreeNode root, List<Integer> output) {
        if (root == null ) return ;

        if(root.left != null) {
            recursivePostorderTraversal(root.left, output);
        }
        if(root.right != null){
            recursivePostorderTraversal(root.right, output);
        }
        output.add( root.val);
    }

    private static void iterativePostorderTraversal(TreeNode root, List<Integer> output) {
        if(root == null) return ;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            output.add(0,cur.val);
            if(cur.left != null){
                stack.add(cur.left);
            }
            if(cur.right != null){
                stack.add(cur.right);
            }
        }
    }
}
