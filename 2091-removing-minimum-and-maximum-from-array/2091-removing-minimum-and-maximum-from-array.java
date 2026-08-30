class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int max=nums[0];
        int maxidx=0;
        int minidx=0;
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) {
                max=nums[i];
                maxidx=i;
            }
           if(nums[i]<min){
            min=nums[i];
            minidx=i;
           }
        }

           // Make minidx the smaller index
        int left = Math.min(minidx, maxidx);
        int right = Math.max(minidx, maxidx);

        // Case 1: Both from front
        int op1 = right + 1;

        // Case 2: Both from back
        int op2 = nums.length - left;

        // Case 3: One from front, one from back
        int op3 = (left + 1) + (nums.length - right);

        return Math.min(op1, Math.min(op2, op3));

    }
}