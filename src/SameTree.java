public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("is same tree : "+ isSameTree(p, q));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return  false;
        } else if( p.val != q.val){
            return false;
        } else {
            return isSameTree(p.left, q.left ) && isSameTree(p.right, q.right);
        }
    }
}
