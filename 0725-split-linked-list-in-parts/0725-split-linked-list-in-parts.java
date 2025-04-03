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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];

        ListNode cur = head;
        int size = 0;
        while(cur != null){
            size++;
            cur = cur.next;
        }

        int baseSize = size / k;
        int remainder = size % k;

        
        cur = head;
        for(int i = 0; i < k; i++){
            result[i] = cur;

            int partSize = baseSize + (i < remainder ? 1 : 0);

            for(int j = 0; j < partSize - 1 && cur != null; j++){
                cur = cur.next;
            }
            if(cur != null){
                ListNode next = cur.next;
                cur.next = null;
                cur = next;
            }

        }
        return result;   
    }
}