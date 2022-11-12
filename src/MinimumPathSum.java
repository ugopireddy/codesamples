public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println("minimum path sum: "+minimumPathSum(matrix));
    }

    private static int minimumPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                dp[i][j] += matrix[i][j];
                if(i>0 && j>0){
                    dp[i][j] += Math.min(dp[i-1][j], dp[i][j-1]);
                }else if(i>0){
                    dp[i][j] += dp[i-1][j];
                }else if(j>0){
                    dp[i][j] += dp[i][j-1];
                }
            }
        }


        return dp[matrix.length-1][matrix[0].length-1];
    }
}
