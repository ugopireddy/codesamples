import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public static void main(String[] args) {
        int[][] points = new int[][]{{1,3},{-2,2}};
        int[][] kClosest = kClosest(points, 1);
        System.out.println("k closest : "+ Arrays.deepToString(kClosest));
    }

    private static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1]*a[1]));
        for (int[] point : points){
            maxHeap.add(point);
            if ( maxHeap.size() > k){
                maxHeap.remove();
            }
        }

        int[][] result = new int[k][2];
        while (k-- > 0){
            result[k] = maxHeap.remove();
        }

        return result;

    }
}
