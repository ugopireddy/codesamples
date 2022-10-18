import com.sun.source.tree.Tree;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode() {
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                " val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
