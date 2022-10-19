import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        boolean isContains = containsDuplicate (nums);
        System.out.println("contains duplicate : " + isContains);
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) {
            if(set.contains(i)){
                return true;
            } else{
                set.add(i);
            }
        }

        return false;
    }

}
