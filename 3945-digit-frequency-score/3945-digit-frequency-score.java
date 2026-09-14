class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        int ans=0;
        for(Map.Entry<Integer,Integer> set:mp.entrySet()){
            int total=set.getKey()*set.getValue();
            ans+=total;
        }
        return ans;
    }
}