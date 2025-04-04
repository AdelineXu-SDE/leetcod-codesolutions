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
    public ListNode removeNodes(ListNode head) {
        if(head == null) return head;
        ListNode rev = reverse(head);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int max = Integer.MIN_VALUE;

        while(rev != null){
            if(rev.val >= max){
                cur.next = new ListNode(rev.val);
                cur = cur.next;
                max = rev.val;
            }
            rev = rev.next;
        }
        return reverse(dummy.next);
        
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

}