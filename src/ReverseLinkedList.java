import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode output  = reverseList3(listNode);
        System.out.println("Reverse list : " + output);
    }

    private static ListNode reverseList3(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode output = new ListNode(0);
        head = output;
        while (!stack.isEmpty()){
            head.next = new ListNode(stack.pop());
            head = head.next;
        }
        return output.next;
    }

    //1-2-3-4-5-null
    //1-null //
    //2-3-4-5-null //next
    //2-1-null
    private static ListNode  reverseList(ListNode head) {
        ListNode output = null;
        while (head != null){
            ListNode next = head.next;
            head.next = output;
            output = head;
            head = next;
        }
        return output;
    }
    public static ListNode reverseList2(ListNode head) {
       if(head == null || head.next == null) return head;
       ListNode res = reverseList2(head.next);
       head.next.next = head;
       head.next = null;
       return res;
    }
}
