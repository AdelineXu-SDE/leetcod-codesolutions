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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null || list2 == null) return list1;


        ListNode cur = list1;
        int index = 1;
        ListNode start = null;
        ListNode last = null;
        
        while(cur != null){
            if(index == a){
                start = cur;
            }
            if(cur.next == null){
                last = cur;
                start.next = list2;
                ListNode newList = list2;
                while(newList.next != null){
                    newList = newList.next;
                }
                newList.next = last;
            }
            cur = cur.next;   
            index++;
        }
        return list1;   
    }
}