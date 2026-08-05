class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(heights[n-1]);
        ans[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int cnt=0;
            while(st.size()>0 && st.peek()<=heights[i]){
                cnt++;
                st.pop();
            }
            if(st.size()>0) cnt++;
            st.push(heights[i]);
            ans[i]=cnt;
        }
        return ans;
    }
}