import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        System.out.println("subsets: "+ subsets(nums).toString());
    }

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<Integer>(), subsets);
        return subsets;
    }
    public static void generateSubsets (int[] nums, int index, List<Integer> current, List<List<Integer>> subsets){
        subsets.add(new ArrayList<Integer>(current));
        for(int i=index; i<nums.length; i++){
            current.add(nums[i]);
            generateSubsets(nums, i+1, current, subsets);
            current.remove(current.size() -1);
        }

    }
}
