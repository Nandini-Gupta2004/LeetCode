class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(ch);
            else if(ch !=')') st.push(ch);
            else {
                String t="";
                while(st.peek()!='('){
                    t=t+st.pop();
                }
                  st.pop();

                // Put reversed characters back
                for (int j = 0; j < t.length(); j++) {
                    st.push(t.charAt(j));
                }

            }
        }
            while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}