class Solution {
    public String removeStars(String s) {
       StringBuilder sb=new StringBuilder();
       Stack<Character> st=new Stack<>();
       for(char ch: s.toCharArray()){
        if(st.isEmpty()) st.push(ch);
       else if(ch=='*') st.pop();
        else{
            st.push(ch);
        }
       } 
       while(!st.isEmpty()){
        sb.append(st.pop());
       }
       return sb.reverse().toString();
    }
}