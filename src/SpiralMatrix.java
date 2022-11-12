import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list = spiralOrder(nums);
        System.out.println("list: "+ list);
        //Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        //Output: [1,2,3,6,9,8,7,4,5]
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom = matrix.length-1;
        int left =0;
        int right=matrix[0].length-1;

        int size = matrix.length * matrix[0].length;
        List<Integer> nums = new ArrayList<Integer>();

        while(nums.size()<size){
            for(int i =left; i<= right && nums.size() < size; i++ ){
                nums.add(matrix[top][i]);
            }
            top++;
            for (int i=top; i<= bottom && nums.size() < size; i++){
                nums.add(matrix[i][right]);
            }
            right--;
            for( int i = right; i>= left && nums.size() < size; i--){
                nums.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i>= top && nums.size() < size; i--){
                nums.add(matrix[i][left]);
            }
            left++;
        }
        return nums;
    }

}
