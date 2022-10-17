import java.util.LinkedList;
import java.util.List;

public class ReorderList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reorderList(listNode);
        System.out.println("Re orderde list : " + listNode);
    }

    private static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return;

        ListNode last = head;
        ListNode secLast = head;
        ListNode tmp = head.next;

        while(last.next != null){
            secLast = last;
            last = last.next;
        }

        head.next = last;
        last.next = tmp;
        secLast.next = null;

        reorderList(tmp);

        //1-2-3-4
    }

}
