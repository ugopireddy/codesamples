public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode bst = buildBST(nums, 0, nums.length-1);
        System.out.println("BST :" + bst.toString());
    }

    private static TreeNode buildBST(int[] nums, int left, int right) {


        //if(nums == null || nums.length == 0) return null;

        if(left>right) return null;

        int mid = (left + right)/2;

        TreeNode result = new TreeNode(nums[mid]);
        result.left = buildBST(nums, left+1, mid);
        result.right = buildBST(nums, mid +1, right);
        return result;
    }
}
