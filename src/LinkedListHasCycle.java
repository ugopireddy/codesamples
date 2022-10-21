public class LinkedListHasCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2=  new ListNode(2);
        ListNode node3=  new ListNode(3);
        ListNode node4 =  new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next= node4;
        node4.next=node2;
        boolean flag  = hasCycle(node1);
        System.out.println("hasCycle list : " + flag);
    }
    private static boolean hasCycle(ListNode head) {
       if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
