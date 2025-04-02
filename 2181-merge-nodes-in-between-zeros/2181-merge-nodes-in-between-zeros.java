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
    public ListNode mergeNodes(ListNode head) {
        if(head == null) return null;

        ListNode first = head;
        ListNode second = head.next;
        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;

        while(second != null){
            int sum = 0;
            while(second != null && second.val != 0){
                sum += second.val;
                second = second.next;
            }
            newHead.next = new ListNode(sum);
            newHead = newHead.next;
            first = second;
            second = second.next;
        }
        return dummy.next;    
    }
}