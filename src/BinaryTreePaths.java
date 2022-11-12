import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> paths = binaryTreePaths(root);

        System.out.println("binary Tree paths : "+ paths);
    }

    private static List<String> binaryTreePaths( TreeNode root) {

        List<String> paths = new ArrayList<>();
        if(root == null) return paths;
        dfs(root, "", paths);
        return paths;
    }

    private static void dfs(TreeNode root, String path, List<String> paths) {

        path += root.val;
        if(root.left == null && root.right == null && root.val != 0){
            paths.add(path.toString());
            return;
        }
        if (root.left != null ){
            dfs( root.left, path + "->", paths);
        }
        if (root.right != null){
            dfs( root.right, path+ "->", paths);
        }
    }
}
