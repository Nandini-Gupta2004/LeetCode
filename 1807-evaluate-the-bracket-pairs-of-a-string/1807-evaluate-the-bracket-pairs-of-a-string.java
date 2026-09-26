class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb=new StringBuilder();
        HashMap<String,String> mp=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            mp.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        
        for(int i=0;i<s.length();i++){
            int idx=i+1;
            if(s.charAt(i)=='('){
                String t="";
                while(s.charAt(idx) !=')'){
                t=t+s.charAt(idx);
                idx++;
                }
                if(mp.containsKey(t)) sb.append(mp.get(t));
                else sb.append("?");
                i=idx;
            }
             else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}