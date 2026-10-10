class Solution {
    public int differenceOfSum(int[] nums) {
        int ele=0;
        int dig=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            ele +=num;
            while(num>0){
                dig += num%10;
                num/=10;
            }
        }
        return Math.abs(ele-dig);
    }
}