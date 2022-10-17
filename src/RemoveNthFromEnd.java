public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        removeNthFromEnd(listNode, 2);
        System.out.println("Re orderde list : " + listNode);
    }
    //0-1-2-3-4-5-null
    private static void removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (n>0){
            fast = fast.next;
            n--;
        }
        while(fast.next != null ){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

    }
}
