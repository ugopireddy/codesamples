public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        System.out.println("Original tree : " + t1);
        System.out.println("invert tree : " + invertBinaryTree(t1));
    }

    private static TreeNode invertBinaryTree(TreeNode root) {
       invert(root);
       return root;
    }

    private static void invert(TreeNode node) {
        if (node == null) return;
        TreeNode tmp = node.right;
        node.right = node.left;
        node.left = tmp;

        invert(node.left);
        invert(node.right);
    }

}

