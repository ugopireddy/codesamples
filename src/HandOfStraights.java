import java.util.PriorityQueue;

public class HandOfStraights {
    public static void main(String[] args) {
        int[] hand = new int[]{1,2,3,6,2,3,4,7,8};
        boolean output = isNStraightHand(hand, 3);
        System.out.println("is N Straight hand : " + output);
    }

    private static boolean isNStraightHand(int[] hand, int w) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : hand) pq.add(i);
        while (!pq.isEmpty()){
            int cur=pq.poll();
            for(int i = 1; i<w; i++){
                if(!pq.remove(cur+i)) return false;
            }
        }
        return true;
    }
}
