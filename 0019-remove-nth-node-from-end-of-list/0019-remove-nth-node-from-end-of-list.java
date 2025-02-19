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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //DS: LinedList
        //A: two pointer
        //find:O(n)
        //delete:O(1)
        //so there is fast and slow pointers, and slow = 0; fast = n;
        //if fast.next is null, then slow is in the node before the target node.
        //then save next node: node.next = node.next.next

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        ListNode slow = dummy, fast = dummy;
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
        
    }
}