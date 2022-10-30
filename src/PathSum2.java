import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(8), new TreeNode(9))), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println("Binary tree " + root.toString());
        List<List<Integer>> paths = pathSum(root, 16);
        System.out.println("Binary tree path to leaf for the sum  : " + paths.toString());

    }

    private static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();

        findPaths(root, sum, new ArrayList<Integer>(), paths);
        return paths;
    }

    private static void findPaths(TreeNode root, int sum, List<Integer> current, List<List<Integer>> paths) {
        if(root == null) return;
        current.add(root.val);
        if(root.left == null && root.right == null && root.val==sum ) {
            paths.add(current);
            return;
        }
        findPaths(root.left, sum -root.val, new ArrayList<Integer>(current), paths);
        findPaths(root.right, sum -root.val, new ArrayList<Integer>(current), paths);

    }
}
