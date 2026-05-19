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
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode temp2=head;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int b=cnt/2;
        while(b-->0){
            temp2=temp2.next;
        }
        return temp2;
    }
}
