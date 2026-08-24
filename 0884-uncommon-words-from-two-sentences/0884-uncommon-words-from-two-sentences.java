class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> ans=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
        String[] s11=s1.split(" ");
        String[] s22=s2.split(" ");
        for(int i=0;i<s11.length;i++)
        mp.put(s11[i],mp.getOrDefault(s11[i],0)+1);

        for(int i=0;i<s22.length;i++)
        mp.put(s22[i],mp.getOrDefault(s22[i],0)+1);

        for(String s:mp.keySet()){
            if(mp.get(s)==1) ans.add(s);
        }

        String[] answ=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            answ[i]=ans.get(i);
        }

        return answ;
    }
}