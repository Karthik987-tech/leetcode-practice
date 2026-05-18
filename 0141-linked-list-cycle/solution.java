/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode back=head;
         ListNode front=head;
         while(front!=null&&front.next!=null){
            front=front.next.next;
            back=back.next;
            if(front==back) return true;
         }
         return false;
    }
}
