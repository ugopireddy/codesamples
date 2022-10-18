public class IsSymmetricTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println("is symmetric tree : " + isSymmetricTree(t1));
    }

    private static boolean isSymmetricTree(TreeNode root) {
        if(root == null ) return true;
        return helper(root.left, root.right);
    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val ) return false;
        return helper(left.left, right.right) && helper(left.right,  right.left);
    }
}
