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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] result = new int[2];
        if(head == null) return result;

        ArrayList<Integer> record = new ArrayList<>();

        ListNode pre = head;
        ListNode cur = head.next;
        int size = 0;

        while(cur != null && cur.next != null){
            size++;
            if(cur.val > pre.val && cur.val > cur.next.val){
                record.add(size);
            }else if(cur.val < pre.val && cur.val < cur.next.val){
                record.add(size);
            }
            pre = pre.next;
            cur = cur.next;
        }

        if(record.size() < 2){
            return new int[]{-1, -1};
        }else{
            int first = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 1; i < record.size(); i++){
                int num = record.get(i) - record.get(first);
                if(num < min){
                    min = num;
                }
                first++;
            }

            int max = record.get(record.size() - 1) - record.get(0);

            result[0] = min;
            result[1] = max;
        }
        return result;   
    }
}