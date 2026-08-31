class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=candyType.length;
        int candy=0;
        for(int i=0;i<candyType.length;i++){
           mp.put(candyType[i],mp.getOrDefault(candyType[i],0)+1);
        }

        if(mp.size()<sum/2) return mp.size();
        else return sum/2;
    }
}