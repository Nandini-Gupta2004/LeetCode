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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        int n = list.size();
        boolean[] keep = new boolean[n];

        int max = Integer.MIN_VALUE;

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {
            if (list.get(i) >= max) {
                keep[i] = true;
                max = list.get(i);
            }
        }
        ListNode dummy = new ListNode(-1);
        temp = dummy;

        for (int i = 0; i < n; i++) {
            if (keep[i]) {
                temp.next = new ListNode(list.get(i));
                temp = temp.next;
            }
        }

        return dummy.next;
        
    }
}