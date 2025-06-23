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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode f = head;
        while(f.next != null && f.next.next != null){
            slow = slow.next;
            f = f.next.next;
        }
        ListNode cur2 = reverse(slow.next);
        ListNode cur1 = head;
        slow.next = null;
        while(cur1 != null && cur2 != null){
            ListNode t1 = cur1.next;
            ListNode t2 = cur2.next;

            cur2.next = cur1.next;
            cur1.next = cur2;

            cur1 = t1;
            cur2 = t2;
        }
    }
}