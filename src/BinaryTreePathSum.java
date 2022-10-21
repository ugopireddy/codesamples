public class BinaryTreePathSum {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(8), new TreeNode(9))), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println("Binary tree " + t1.toString());
        boolean hasSum = hasPathSum(t1, 16);
        System.out.println("Binary tree farthest node depth  : " + hasSum);
    }

    private static boolean hasPathSum(TreeNode root, int sum) {
         if(root == null) return  false;
         if (root.left == null && root.right == null && root.val == sum) return true;
         return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
