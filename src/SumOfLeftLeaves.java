public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int sum = sumOfLeftLeaves(root);
        System.out.println("sumOfLeftLeaves : "+ sum);
    }

    private static int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }else if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.val + sumOfLeftLeaves(root.right);
        }else{
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }

    }
}
