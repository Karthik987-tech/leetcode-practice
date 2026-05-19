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
       ListNode temp=head;
       int cnt=0;
       while(temp!=null){
        cnt++;
        temp=temp.next;
       }
       temp = head;
       int arr[]=new int[cnt];
       int i=0;
       while(temp!=null){
arr[i]=temp.val;
temp=temp.next;
i++;
       }
       int first=0;
       int last=cnt-1;
       while(first<last){
        if(arr[first]!=arr[last]) return false;
        last--;
        first++;
       }
       return true;
        }
    }
