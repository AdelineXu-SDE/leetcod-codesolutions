/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //DS: Linked List
        //A: delete
        //How efficient: 
        // - find:O(1)
        // - delete: O(1)
        node.val = node.next.val;
        node.next = node.next.next;
    }
}