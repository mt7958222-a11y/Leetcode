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
    public ListNode reverseList(ListNode head) {
        List<Integer> v=new ArrayList<>();
        ListNode temp=head;
       
        while(temp!=null){
            v.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        for(int i=v.size()-1;i>=0;i--){
            temp.val=v.get(i);
            temp=temp.next;
        }
        return head;
    }
}