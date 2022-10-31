import java.util.HashMap;

public class CanPartition {
    public static void main(String[] args) {
        int[] nums = new int[] {1,5,5,11};
        System.out.println("can partition: "+ canPartition(nums));
    }

    public static boolean canPartition(int[] nums){
        int total =0;
        for (int i : nums){
            total+=i;
        }
        if( total %2 !=0) {
            return  false;
        }
        return canPartition(nums, 0, 0, total, new HashMap<String, Boolean>());
    }

    private static boolean canPartition(int[] nums, int index, int sum, int total, HashMap<String, Boolean> state) {
        String current = index + "" + sum;
        boolean foundPartition = true;
        if(state.containsKey(current)){
            return foundPartition;
        }
        if(sum*2 == total) {
            return true;
        }
        if( sum >= total/2 || index >= nums.length){
            return false;
        }

        foundPartition = canPartition(nums, index +1, sum, total, state ) ||
                canPartition(nums, index +1, sum + nums[index], total, state);

        state.put(current, foundPartition);
        return foundPartition;
    }
}
