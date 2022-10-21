public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int index = binarySearch(nums, 5);
        System.out.println("index of the target : "+ index);
    }
    public static int binarySearch(int[] nums, int target){
        int start=0, end = nums.length -1;
        while (start < end){
            int mid = start + (end-start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
