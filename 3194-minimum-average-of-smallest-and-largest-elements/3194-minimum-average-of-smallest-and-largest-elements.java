class Solution {
    public double minimumAverage(int[] nums) {
     int n=nums.length;
      Arrays.sort(nums);
     int i=0;
     int j=n-1;
     double mini=Integer.MAX_VALUE;
     while(n/2>0){
        double a=(nums[i]+nums[j])/2.0;
        mini=Math.min(mini,a);
        i++;
        j--;
        n--;
     }  
     return mini; 
    }
}