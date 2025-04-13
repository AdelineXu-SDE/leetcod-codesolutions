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
    public ListNode removeZeroSumSublists(ListNode head) {
        int preSum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        Map<Integer, ListNode> map = new HashMap<>();

        while(cur != null){
            preSum += cur.val;
            map.put(preSum, cur);
            cur = cur.next;
        }

        preSum = 0;
        cur = dummy;

        while(cur != null){
            preSum += cur.val;
            cur.next = map.get(preSum).next;
            cur = cur.next;
        }
        return dummy.next;   
    }
}