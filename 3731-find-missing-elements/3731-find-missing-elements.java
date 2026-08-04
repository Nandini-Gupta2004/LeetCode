class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int lar=nums[0];
        int small=nums[0];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            lar=Math.max(lar,nums[i]);
            small=Math.min(small,nums[i]);
            mp.put(nums[i],1);
        }
        for(int i=small;i<=lar;i++){
            if(!mp.containsKey(i))
            ans.add(i);
        }
        return ans;
    }
}