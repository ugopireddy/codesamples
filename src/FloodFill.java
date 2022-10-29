import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int[][] filledImage = floodFill(image, 1, 1, 2);
        System.out.println("filled image : "+ Arrays.deepToString(filledImage));
    }

    private static int[][] floodFill(int[][] image, int r, int c, int color) {
        if (image[r][c] == color) {
            return image;
        }
        fill(image, r, c, image[r][c], color);
        return image;
    }

    private static void fill(int[][] image, int r, int c, int color, int newColor) {
        if(r <0 || r >= image.length || c <0 || c>= image.length || image[r][c] != color) return;

        image[r][c] = newColor;
        fill(image, r, c+1, color, newColor);
        fill(image, r, c-1, color, newColor);
        fill(image, r-1, c, color, newColor);
        fill(image, r+1, c, color, newColor);
    }
}
