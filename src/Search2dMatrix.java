public class Search2dMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
        System.out.println("isFound : " + search2dMatrix(input, 12));
    }

    private static boolean search2dMatrix(int[][] input, int target) {
        int rows = input.length;
        int cols = input[0].length;

        int start = 0;
        int end = rows * cols -1 ;

        while (start <= end){
            int mid = start + (end-start)/2;
            int cur = input[mid/cols][mid % cols];
            if ( cur == target) {
                return true;
            }
            else if (cur < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return false;
    }
}
