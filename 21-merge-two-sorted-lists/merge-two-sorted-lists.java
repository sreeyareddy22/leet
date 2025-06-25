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
    public ListNode mergeTwoLists(ListNode cur1, ListNode cur2) {
        ListNode res = new ListNode(-1);
        ListNode curr = res;
        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                curr.next = cur1;
                cur1 = cur1.next;
            }
            else{
                curr.next = cur2;
                cur2 = cur2.next;
            }
            curr = curr.next;
        }
        if(cur1 != null){
            curr.next = cur1;
        }
        else 
            curr.next = cur2;
        return res.next;
    }
}