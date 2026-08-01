 
class Solution {
    public ListNode reverse(ListNode head){
        ListNode p=null;
        ListNode curr=head;
        ListNode n=null;
        while(curr!=null){
            n=curr.next;
            curr.next=p;
            p=curr;
            curr=n;
        }
        return p;

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        for(int i=1;i<left;i++){
            temp=temp.next;
        }
        ListNode tail1=temp;
        ListNode head2=tail1.next;

        temp=head2;
        for(int i=left;i<right;i++){
            temp=temp.next;
        }
        ListNode tail2=temp; 
        ListNode head3=temp.next;
          tail2.next = null;

        ListNode newHead=reverse(head2);
        tail1.next=newHead;
        head2.next=head3;
        return dummy.next;


    }
}