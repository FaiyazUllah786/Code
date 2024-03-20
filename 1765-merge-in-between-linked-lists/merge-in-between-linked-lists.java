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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode fastPart = list1;
        int i = 0;
        while(fastPart!=null&&i<a-1){
            fastPart = fastPart.next;
            i+=1;
        }
        ListNode secondPart = fastPart.next;
        
        i=0;
        while(secondPart!=null && i<b-a+1){
            secondPart = secondPart.next;
            i+=1;
        }
        fastPart.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = secondPart;
        return list1;
    }
}