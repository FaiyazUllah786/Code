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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        List<Integer> li = new ArrayList<>();
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
        }
        int size = li.size();
        int i=1,j=size-1;
        temp = head;
        while(i<j){
            ListNode newN1= new ListNode(li.get(i));
            ListNode newN2= new ListNode(li.get(j));
            temp.next = newN2;
            temp.next.next = newN1;
            temp = temp.next.next;
            i++;j--;
        }
        if(size%2==0){
            ListNode newN2= new ListNode(li.get(j));
            temp.next = newN2;
            temp=temp.next;
        }
        temp.next=null;
    }
}