 import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {

                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());

                int result = 0;

                if (s.equals("+")) {
                    result = b + a;
                } else if (s.equals("-")) {
                    result = b - a;
                } else if (s.equals("*")) {
                    result = b * a;
                } else if (s.equals("/")) {
                    result = b / a;
                }

                st.push(String.valueOf(result)); 
            } else  st.push(s);
            
        }

        return Integer.parseInt(st.pop());
    }
}