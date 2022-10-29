import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = new int[][]{{1,1,0},{0,1,0},{0,0,1}};
        System.out.println("image before flip : "+ Arrays.deepToString(image));
        int[][] flippedImage = flipAndInvertImage(image);
        System.out.println("image after flip : "+ Arrays.deepToString(flippedImage));

    }

    private static int[][] flipAndInvertImage(int[][] A) {

        for (int i =0; i<A.length; i ++){
            int j=0;
            int k=A[i].length -1;
            while (j<k){
                int tmp = A[i][j];
                A[i][j++] = A[i][k];
                A[i][k--] = tmp;
            }
            for (int l =0; l< A.length; l++){
                A[i][l] = A[i][l] ==1 ? 0 : 1 ;
            }
        }
        return A;
    }
}
