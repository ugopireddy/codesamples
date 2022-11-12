import java.util.Arrays;

public class MineSweeper {
    public static void main(String[] args) {
        boolean[][] matrix = new boolean[][]{{true, false, false},{false, true, false}, {false, false, false}};
        int[][] mines = solution(matrix);
        System.out.println("mines : "+ Arrays.deepToString(mines));
    }
    private static int[][] solution(boolean[][] matrix) {
        int[][] mines = new int[matrix.length][matrix[0].length];
        for (int i=0; i<matrix.length; i++ ){
            for(int j=0; j<matrix[i].length; j++){
                mines[i][j] = dfs (matrix, i, j );
            }
        }
        return mines;
    }
    private static int dfs(boolean[][] mat, int rw, int cl){
        int mines =0;
        int u = rw-1  >= 0 ? rw-1 : 0;
        int d = rw+1 <= mat.length-1 ? rw+1 : mat.length-1 ;
        int l = cl-1 >= 0 ? cl-1 : 0;
        int r = cl+1 <= mat[0].length -1 ?   cl+1 : mat[0].length-1;

        for(int i=u; i<=d; i++){
            for (int j=l; j<=r; j++){
                if(mat[i][j] && !(rw == i && cl==j)){
                    mines++;
                }
            }
        }

        return mines;
    }
}
