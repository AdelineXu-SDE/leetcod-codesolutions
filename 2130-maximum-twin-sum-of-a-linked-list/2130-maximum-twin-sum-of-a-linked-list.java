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
    public int pairSum(ListNode head) {
        if(head == null) return 0;
        //find mid
        //reverse second part
        //two pointers

        ListNode first = head;
        ListNode second = head;

        while(first.next != null && first.next.next != null){
            first = first.next.next;
            second = second.next;
        }
        ListNode pre = null;
        ListNode cur = second.next;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        cur = head;
        ListNode secondHead = pre;

        int max = Integer.MIN_VALUE;
        while(cur != null && pre != null){
            int sum = cur.val + pre.val;
            max = Math.max(max, sum);
            cur = cur.next;
            pre = pre.next;
        }

        return max;


        
    }
}