import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};

        int[] output = nextGreaterElement(nums1, nums2);
        System.out.println("Next greater element :  " + Arrays.toString(output));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map <Integer, Integer> nextGreater  = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i =0; i < nums2.length; i ++){
            while(!stack.isEmpty() && stack.peek() < nums2[i]) {
                nextGreater.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for (int i=0; i<nums1.length; i++){
            nums1[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
