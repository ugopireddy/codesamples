import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BestSumDP {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,5,25};
        List<Integer> inputList = Arrays.stream(input).boxed().toList();
        HashMap<Integer, List<Integer>> memo = new HashMap<>();
        List<Integer> output = bestSumDP(100, inputList, memo);
        System.out.println( output == null ? null : output.toString());
    }

    private static List<Integer> bestSumDP(int targetSum, List<Integer> inputList, HashMap<Integer, List<Integer>> memo) {

        if(memo.containsKey(targetSum) ) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>() ;
        if(targetSum < 0) return null;

        List<Integer> shortestCombination = null;
        for (int num : inputList){
            int remainder  = targetSum - num;
            List<Integer> remainderCombo = bestSumDP(remainder, inputList, memo);
            if(remainderCombo != null) {
                List<Integer> combination = new ArrayList<>(remainderCombo);
                combination.add(num);
                if(shortestCombination == null || combination.size() < shortestCombination.size()){
                    shortestCombination = combination;
                }
            }
        }
        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }
}
