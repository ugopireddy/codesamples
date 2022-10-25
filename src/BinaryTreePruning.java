import java.util.ArrayList;
import java.util.List;

public class BinaryTreePruning {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(0, new TreeNode(1), new TreeNode(0, new TreeNode(0), new TreeNode(0))), new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        System.out.println("Binary tree before pruning" + t1.toString());
        TreeNode output = pruneTree(t1);
        //[4, 2, 8, 5, 9, 1, 6, 3, 7]
        System.out.println("Binary tree after pruning  : " + output.toString());

    }

    private static TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        TreeNode output = new TreeNode(root.val);

        output.left = pruneTree(root.left);
        output.right = pruneTree(root.right);

        if(root.val ==0 && root.left == null && root.right== null){
            return null;
        }
        return output;
    }
}
