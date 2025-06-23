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
        ListNode f = head;
        while(f.next != null && f.next.next != null){
            slow = slow.next;
            f = f.next.next;
        }
        Stack<ListNode> st = new Stack<>();
        ListNode nn = slow.next;
        while(nn != null){
            st.push(nn);
            nn = nn.next;
        }
        slow.next = null;
        ListNode curr = head;
        while(!st.isEmpty()){
            ListNode top = st.pop();
            top.next = curr.next;
            curr.next = top;
            curr = curr.next.next;
        }
    }
}