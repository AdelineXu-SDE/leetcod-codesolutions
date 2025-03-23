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
        
        if(head == null || head.next == null){
            return;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode pre = null;
        ListNode second = slow.next;
        slow.next = null;
        while(second != null){
            ListNode next = second.next;
            second.next = pre;
            pre = second;
            second = next;
        }

        ListNode cur = head;
        while(pre != null){
            ListNode nextCur = cur.next;
            ListNode nextPre = pre.next;
            cur.next = pre;
            pre.next = nextCur;  

            cur = nextCur;
            pre = nextPre;
        }
    }
}