public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights =new int[]{1,8,6,2,5,4,8,3,7};
        int water = maxArea(heights);
        System.out.println("max water area : " + water);
    }

    private static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int max = 0;
        while (left < right){
            int width = right -left;
            int h = Math.min(heights[left], heights[right] );
            int area = width * h;
            max = Math.max(max, area);
            if(heights[left]<heights[right]) left++;
            else if(heights[left]>heights[right]) right --;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}

