public class RemoveListElements {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(3)))));
        ListNode output = removeElements(listNode, 3);
        System.out.println("List after removing elements  : " + listNode);
    }

    private static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode output = dummy;
        dummy.next = head;
        while (head != null){
            if(head.val == val){
                head = head.next;
                dummy.next = head;
            }else {
                head = head.next;
                dummy = dummy.next;
            }
        }
        return output.next;
    }
}
