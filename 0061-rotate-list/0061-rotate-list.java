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
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || head.next==null ||k==0)
        return head;
        ListNode ptr1=head;
         
        int size=1;
         
      while(ptr1.next!=null ){
        ptr1=ptr1.next;
        size++;
      }
      k=k%size;
      if(k==0)
      return head;
      ListNode ptr2=head;
      for(int i=0;i<size-k-1;i++){
        ptr2=ptr2.next;
      }
      ListNode ptr3=ptr2.next;
    
      ptr1.next=head;
    ptr2.next=null;
    return ptr3;
    }
}