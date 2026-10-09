/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode Secondhead = slow.next;
        slow.next = null;
        ListNode temp = null;
        while (Secondhead != null) {
            ListNode forw = Secondhead.next;
            Secondhead.next = temp;
            temp = Secondhead;
            Secondhead = forw;
        }
        ListNode first = head;
        ListNode second = temp;
        while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondnext = second.next;
            first.next = second;
            second.next = firstNext;
            first = firstNext;
            second = secondnext;
        }
    }
}
