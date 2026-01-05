public class ListNode {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr; 
            curr = prev;          
            prev = curr;              
            curr = next;              
        }

        return prev;
    }
}
