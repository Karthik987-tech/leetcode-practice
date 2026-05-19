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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode dummy=new ListNode(-1);
      ListNode temp =head;
      ListNode temp2 =dummy;
      temp2.next=head;
      while(temp!=null){
        temp=temp.next;
        cnt++;
      }  
      int b=Math.abs(n-cnt);
      while(b-->0){
        temp2=temp2.next;
      }
      temp2.next=temp2.next.next;
      return dummy.next;
    }
}
