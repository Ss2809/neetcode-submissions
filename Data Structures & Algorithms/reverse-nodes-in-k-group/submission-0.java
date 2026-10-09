
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode ans = new ListNode(0);
        ListNode tail = ans;

        while (curr != null) {
            ListNode kth = curr;

            for (int i = 1; i < k && kth != null; i++) {
                kth = kth.next;
            }

            if (kth == null) {
                tail.next = curr;
                break;
            }

            ListNode next = kth.next;
            kth.next = null;

            tail.next = reverse(curr);
            tail = curr;
            curr = next;
        }

        return ans.next;
    }
}
