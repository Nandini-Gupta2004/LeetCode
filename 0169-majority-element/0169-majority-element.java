class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cnt==0){
                max=nums[i];
                cnt++;
            } else if(nums[i]==max){
                cnt++;
            } else cnt--;
        }
        return max;
    }
}