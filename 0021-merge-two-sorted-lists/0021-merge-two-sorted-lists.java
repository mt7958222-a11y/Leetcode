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
        ListNode temp1=list1;
        ListNode temp2=list2;
        ArrayList<Integer> v=new ArrayList<>();
        while(list1!=null){
        v.add(list1.val);
        list1=list1.next;
        }
        temp1=list1;
        while(list2!=null){
            v.add(list2.val);
            list2=list2.next;
        }
        temp2=list2;
        Collections.sort(v);
ListNode dummy=new ListNode(0);
ListNode curr=dummy;
for(int i=0;i<v.size();i++){
    curr.next=new ListNode(v.get(i));
    curr=curr.next;
}
return dummy.next;
    }
}