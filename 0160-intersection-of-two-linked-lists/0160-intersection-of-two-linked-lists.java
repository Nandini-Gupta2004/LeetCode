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
        ListNode t1=headA;
        ListNode t2=headB;
        int cnt1=0;
        int cnt2=0;
        while(t1 !=null){
            cnt1++;
            t1=t1.next;
        }
        while(t2 !=null){
            cnt2++;
            t2=t2.next;
        }

         t1=headA;
         t2=headB;

        if(cnt1>cnt2){
            for(int i=1;i<=cnt1-cnt2;i++){
                t1=t1.next;
            }
        } 
        if(cnt1<cnt2){
            for(int i=1;i<=cnt2-cnt1;i++){
                t2=t2.next;
            }
        }

        while(t1 !=t2){
            t1=t1.next;
            t2=t2.next;
        }

        return t1;
    }
}