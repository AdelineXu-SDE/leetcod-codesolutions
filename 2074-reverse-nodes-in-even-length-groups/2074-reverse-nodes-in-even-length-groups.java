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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode cur = head;
        int groupSize = 1;

        while(cur != null){
            ListNode groupStart = cur;
            int count = 0;
            ListNode temp = cur;
            for(int i = 0; i < groupSize && temp != null; i++){
                temp = temp.next;
                count++;
            }

            if(count % 2 == 0){
                ListNode[] reversed = reverseKNodes(cur, count);
                prevGroupEnd.next = reversed[0];
                cur.next = reversed[1];
                prevGroupEnd = cur;
                cur = reversed[1];
            }else{
                for(int i = 0; i < count; i++){
                    prevGroupEnd = cur;
                    cur = cur.next;
                }
            }
            groupSize++;
        }
        return dummy.next;
    }

    private ListNode[] reverseKNodes(ListNode head, int k){
        ListNode prev = null;
        ListNode cur = head;
        while(k-- > 0 && cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return new ListNode[]{prev, cur};
    }
}