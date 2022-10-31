import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = new int[] {10,1,2,7,1,5,6};
        System.out.println("find combinations : "+combinationSum(candidates, 8).toString());
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, 0, target, new ArrayList<Integer>(), result );
        return result;
    }

    private static void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if(target ==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }

        for(int i=index; i<candidates.length; i++){
            if(i == index || candidates[i] != candidates[i-1]){
                current.add(candidates[i]);
                findCombinations(candidates, i+1, target - candidates[i], current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
