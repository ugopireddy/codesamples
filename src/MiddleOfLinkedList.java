public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9)))))))));
        ListNode middleOfList  = middleOfList(listNode);
        System.out.println("middleOfList  : " + middleOfList.toString());
    }

    private static ListNode middleOfList(ListNode head) {
        if (head == null ) return head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
        }

        return slow;
    }

}
