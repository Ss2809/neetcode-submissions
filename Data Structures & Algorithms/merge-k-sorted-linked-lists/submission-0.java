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
    public ListNode mergeKLists(ListNode[] lists) {
       List<Integer>nodes  = new ArrayList<>();
       for(ListNode i : lists){
        while(i != null){
            nodes.add(i.val);
            i = i.next;
        }
       }
       Collections.sort(nodes);
       ListNode ans = new ListNode(0);
       ListNode temp = ans;
       for(int i:nodes){
        temp.next= new ListNode(i);
        temp = temp.next;
       }
       return ans.next;
    }
}
