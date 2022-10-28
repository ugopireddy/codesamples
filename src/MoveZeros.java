import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums= new int[]{0,1,3,0,5,6};
        int[] result = moveZeros(nums);
        System.out.println("nums after zeros moved : "+ Arrays.toString(result));
    }

    private static int[] moveZeros(int[] nums) {
        int index =0;
        for (int i=0; i< nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for(int i =index; i<nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }

}
