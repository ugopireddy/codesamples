public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        boolean flag  = isPalindrome(listNode);
        System.out.println("isPalindrome list : " + flag);
    }

    private static boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode slow=head, fast=head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode tmp = reverseList(slow);

        while (tmp != null) {
            if(tmp.val != head.val){
                return false;
            }else{
                tmp = tmp.next;
                head = head.next;
            }
        }
        return true;

    }

    private static ListNode reverseList(ListNode root) {
        ListNode output = null;
        while (root != null) {
            ListNode tmp = root.next;
            root.next = output;
            output = root;
            root = tmp;
        }

        return output;
    }
}
