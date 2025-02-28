/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //DS: Linkedlist
        //A: two pointers
        //O(m + n)
        
        //count size first
        int sizeA = 0;
        ListNode currA = headA;
        while(currA != null){
            currA = currA.next;
            sizeA++;
        }

        int sizeB = 0;
        ListNode currB = headB;
        while(currB != null){
            currB = currB.next;
            sizeB++;
        }
        int diff = Math.abs(sizeA - sizeB);
        ListNode newA = headA;
        ListNode newB = headB;
        
        if(sizeA > sizeB){
            for(int i = 0; i < diff; i++){
                newA = newA.next;
            }
        }else{
            for(int j = 0; j < diff; j++){
                newB = newB.next;
            }
        }

        while(newA != null && newB != null){
            if(newA == newB){
                return newA;
            }
            newA = newA.next;
            newB = newB.next;
        }
        return null;
    }
}