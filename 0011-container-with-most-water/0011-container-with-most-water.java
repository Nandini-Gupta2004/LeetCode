class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ans=0;
        int lp=0;
        int rp=n-1;;
        while(lp<rp){
            int area=Math.min(height[lp],height[rp])*(rp-lp);
            ans=Math.max(ans,area);
            if(height[lp]<height[rp]) lp++;
            else rp--;
        }
        return ans;
    }
}