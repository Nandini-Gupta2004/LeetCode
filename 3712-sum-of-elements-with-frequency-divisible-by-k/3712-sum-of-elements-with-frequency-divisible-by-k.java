class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        for(int key :mp.keySet()){
            if(mp.get(key)%k==0){
                int val=mp.get(key);
                while(val>0){
                    sum+=key;
                    val--;
                }
            }
        }
        return sum;

    }
}