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
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode last = reverse(head);
        if(n == 1 && last.next == null)
            return null;
        ListNode curr = last;
        ListNode prev = null;
        for(int i = 1;i < n;i++){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null)
            last = curr.next;
        else
            prev.next = curr.next;
        return reverse(last);
    }
}