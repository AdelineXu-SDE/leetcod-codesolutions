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
    public boolean isPalindrome(ListNode head) {
        //DS: linkedlist
        //A:two pointer
        //O(n)
        //I should find the mid first, so I need two pointers, the fast one is move twice than slow one
        ListNode fast = head;
        ListNode slow = head;
        ListNode current = head;

        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;   
        }
        ListNode reversed = reverseList(slow);
        ListNode start = head;    
        while(reversed != null){
            if(reversed.val != start.val){
                return false;
            }
            reversed = reversed.next;
            start = start.next;
        }
        return true;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}