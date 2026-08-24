class Solution {
    public int dominantIndex(int[] nums) {
       int lar=nums[0];
       int idx=0;
       for(int i=0;i<nums.length;i++){
       if(nums[i]>lar){
        lar=nums[i];
        idx=i;
        }
       }

        for(int i=0;i<nums.length;i++){
         if (i != idx && lar < 2 * nums[i]) {
                return -1;
            }
        }
        return idx;
    }
}