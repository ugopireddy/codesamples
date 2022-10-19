import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,7,9};
        int target = 6;
        int [] indexes = twoSum(nums, target);
        System.out.println("indexes : "+ Arrays.toString(indexes));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment) != i){
                return new int[]{ map.get(compliment), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return  null;
    }
}
