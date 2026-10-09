
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode Ahead = list1;
        ListNode Bhead = list2;

        ListNode ans = new ListNode();
        ListNode temp = ans;

        while (Ahead != null && Bhead != null) {
            if (Ahead.val <= Bhead.val) {
                temp.next = Ahead;
                Ahead = Ahead.next;
            } else {
                temp.next = Bhead;
                Bhead = Bhead.next;
            }
            temp = temp.next;
        }

        if (Ahead != null) {
            temp.next = Ahead;
        }

        if (Bhead != null) {
            temp.next = Bhead;
        }

        return ans.next;
    }
}
