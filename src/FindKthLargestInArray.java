import java.util.PriorityQueue;

public class FindKthLargestInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,3,4,6,2};
        int largest = findKthlargest(nums, 2);
        System.out.println("kth largest : "+ largest);
    }

    private static int findKthlargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i: nums){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}
