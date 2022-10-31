import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5,
                        new TreeNode(8), new TreeNode(9))),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println("Binary tree right side view : "+ rightSideView(t1));
    }

    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> visbleValues = new ArrayList<>();
        if (root == null){
            return visbleValues;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while ( !queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode current = queue.remove();
                if(i == size -1){
                    visbleValues.add(current.val);
                }
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }
        return visbleValues;
    }
}
