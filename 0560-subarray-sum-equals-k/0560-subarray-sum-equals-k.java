class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int cnt=0;
        mp.put(0,1);
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(mp.containsKey(sum-k)){
                cnt+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}