import java.util.Arrays;

public class SumClosest {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int target = 1;
        int closest = sumClosest(nums, target);
        System.out.println("3sum closest : "+ closest);
    }

    private static int sumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);

        for (int i =0; i<=n-3; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int currentSum = nums[i] + nums[left]+nums[right];

                if(Math.abs(target-closest) > Math.abs(target-currentSum)) {
                    closest= currentSum;
                }
                if (currentSum < target) {
                    left ++;
                }else{
                    right --;
                }
            }
        }
        return closest;
    }
}
