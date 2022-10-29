public class MonotonicArray {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,3};
        boolean isMonotonic = isMonotonic(input);
        System.out.println("is Monotonic : "+ isMonotonic);
    }

    private static boolean isMonotonic(int[] input) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i =0; i< input.length -1; i ++){
            if (input[i]< input[i+1]){
                decreasing = false;
            }
            if (input[i]> input[i+1]){
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
