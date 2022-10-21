import java.util.ArrayList;
import java.util.List;

public class MaxDepthOfTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(8), new TreeNode(9))), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println("Binary tree " + t1.toString());
        int depth = maxDepth(t1);
        System.out.println("Binary tree farthest node depth  : " + depth);
    }

    private static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return  1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
