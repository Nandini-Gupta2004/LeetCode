import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> ls=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ls.add(temp.val);
            temp=temp.next;
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<ls.size();i++){
            sb.append(ls.get(i));
        }

       BigInteger sum = new BigInteger(sb.toString());
BigInteger ans = sum.multiply(BigInteger.valueOf(2));
String str = ans.toString();

        ListNode dummy=new ListNode(-1);
         ListNode curr = dummy;

        for (int i = 0; i < str.length(); i++) {
            curr.next = new ListNode(str.charAt(i) - '0');
            curr = curr.next;
        }

        return dummy.next;

    }
}