import java.util.Arrays;

public class BlurImage {
    public static void main(String[] args) {
        int[][] image = new int[][] {{1,1,1},{1,5,1},{1,1,1}};
        int[][] blur = blurImage(image);
        System.out.println("blur image "+ Arrays.deepToString(blur));
    }
    public static int[][] blurImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        int[][] blur = new int[rows-2][cols-2];

        for(int r=1; r<rows-1; r++ ){
            for(int c=1; c<cols-1; c++){
                blur[r-1][c-1] = getAvg(image, r, c);
            }
        }
        return blur;
    }

    private static int getAvg(int[][] img, int r, int c){
        return (img[r-1][c-1]+ img[r-1][c] + img[r-1][c+1] +
                img[r][c-1]+ img[r][c] + img[r][c+1] +
                img[r+1][c-1]+ img[r+1][c] + img[r+1][c+1]
        )/9;
    }
}
