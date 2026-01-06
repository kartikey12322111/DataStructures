public class SwapNodePair {
     public ListNode swapPairs(ListNode head) {
        if(head == null || head == null)return head;
        ListNode first = head;
        ListNode second = head;
        first = swapPairs(second);
        second = first;
        return second;
    }
}
