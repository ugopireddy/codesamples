public class PivotIndex {
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,2,3};
        int pivot = pivotIndex(nums);
        System.out.println("pivotIndex   "+ pivot);
    }
    public static int pivotIndex(int[] nums) {
         int sum =0; int leftSum = 0;
         for (int i : nums ) sum = sum + i;
         for (int i =0; i < nums.length; i ++){
             if (leftSum == sum - leftSum - nums[i]) return i;
             leftSum = leftSum + nums[i];
         }
         return -1;
    }
}
