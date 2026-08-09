class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++) q.add(i);

        while(q.size()>1){
            int j=1;
            while(j<k){
                q.add(q.remove());
                j++;
            }
            q.remove();
        }
        return q.peek();
    }
}