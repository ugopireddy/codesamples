import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInTreeRow {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(8), new TreeNode(9))), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println("Binary tree " + t1.toString());
        List<Integer> largest = findlargest(t1);
        System.out.println("Largest value in each tree row  : " + largest.toString());
    }

    private static List<Integer> findlargest(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root, output, 0);
        return output;
    }

    private static void helper(TreeNode root, List<Integer> output, int lvl) {
        if(root ==null) return;
        if(output.size() == lvl){
            output.add(root.val);
        }else {
            output.set(lvl, Math.max(output.get(lvl), root.val));
        }
        helper(root.left, output, lvl+1);
        helper(root.right, output, lvl+1);
    }
}
