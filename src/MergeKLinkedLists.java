import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKLinkedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(2, new ListNode(3, new ListNode(6,new ListNode(7))));

       // ListNode mergedList = mergeTwoLists(l1, l2);
        List<ListNode> lists = new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        ListNode kList = mergeKLists(lists);
        System.out.println("Merged list : " + kList.toString());
    }

    private static ListNode mergeKLists(List<ListNode> lists) {
        if(lists == null || lists.size() ==0) return null;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (ListNode head :  lists){
            while(head != null){
                minHeap.add(head.val);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(!minHeap.isEmpty()){
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        return dummy.next;
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode output = tmp;
        while(l1!=null && l2 != null){
            if(l1.val > l2.val){
                tmp.next = l2;
                l2 = l2.next;
            } else {
                tmp.next = l1;
                l1 = l1.next;
            }
            tmp = tmp.next;
        }
        if(l1 != null ) tmp.next = l1;
        if(l2 != null ) tmp.next = l2;

        return output.next;
    }

}
