import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3,1,3};
        int singleNum= singleNumber(nums);
        System.out.println("single number : "+ singleNum);
    }

    private static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1 );
        }

        for (int key : map.keySet()){
            if (map.get(key) == 1) {
                return  key;
            }
        }

        return -1;
    }
}
