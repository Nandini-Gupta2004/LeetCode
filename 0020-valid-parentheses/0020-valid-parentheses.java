class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='['){
                st.push(ch);
            } else {
                if(st.isEmpty()) return false;
                 char top=st.peek();
                 if(top=='(' && ch==')') st.pop();
                 else if(top=='{' && ch=='}') st.pop();
                  else if(top=='[' && ch==']') st.pop();
                  else return false;
            }
        }

    return st.isEmpty();

     }
}