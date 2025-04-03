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
    public int numComponents(ListNode head, int[] nums) {
        if(head == null) return 0;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        ListNode cur = head;
        int count = 0;

        while(cur != null){
            if(set.contains(cur.val) && (cur.next == null || !set.contains(cur.next.val))){
                count++;
            }
            cur = cur.next;

        }
        return count;  
    }
}