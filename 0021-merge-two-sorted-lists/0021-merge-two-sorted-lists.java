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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //DS: LinkedList
        //A: merge
        //O(m + n)
        //Creat new head, use two pointer, and them compare 

        ListNode first = list1;
        ListNode second = list2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(first != null && second != null){
            if(first.val <= second.val){
                current.next = first;
                first = first.next;
            }else{
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }
        while(first != null){
            current.next = first;
            first = first.next;
        }

        while(second != null){
            current.next = second;
            second = second.next;
        }
        return dummy.next;
        
    }
}