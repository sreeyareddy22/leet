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
    public int getDecimalValue(ListNode head) {
        int len = 0;
        ListNode curr = head;
        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        int num = 0;
        curr = head;
        while(curr != null){
            num += (1<<len)*(curr.val);
            System.out.println(len+" "+num);
            len--;
            curr = curr.next;
        }
        return num;
    }
}