class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int ans=0;
        while(lp<rp){
            int area=Math.min(height[lp],height[rp])*(rp-lp);
            ans=Math.max(ans,area);

            if(height[lp]<height[rp]) lp++;
            else rp--;
        }
        return ans;
    }
}