import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 4, 5, 2, 3};
        int[] sortedSquares = sortedSquares(nums);
        System.out.println("sortedSquares "+ Arrays.toString(sortedSquares));
    }

    private static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(i->i*i).sorted().toArray();
    }
}
