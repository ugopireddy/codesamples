public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        TreeNode t2 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        System.out.println("merged tree : " + mergeTrees(t1, t2));
    }

    private static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if( t1 == null && t2 == null) return null;
        if( t1 == null) return t2;
        if(t2 == null) return t1;
        TreeNode output = new TreeNode(t1.val + t2.val);
        output.left = mergeTrees(t1.left, t2.left);
        output.right = mergeTrees(t1.right, t2.right);
        return output;
    }

}
