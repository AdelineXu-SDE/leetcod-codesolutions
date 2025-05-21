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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = head;
        ListNode pre = dummy;

        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                int dupVal = cur.val;
                while(cur != null && cur.val == dupVal){
                    cur = cur.next;
                }
                pre.next = cur;
            }else{
                pre = cur;
                cur = cur.next;
            
            }

        }

        return dummy.next;
        
    }
}