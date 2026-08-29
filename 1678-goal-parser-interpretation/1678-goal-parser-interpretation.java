class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){
            char ch=command.charAt(i);
            if(ch=='G') sb.append(ch);
            else if(ch=='(' && command.charAt(i+1)==')'){
                sb.append("o");
            }
            else if(ch=='(' && command.charAt(i+1)=='a'){
                sb.append("al");
                i++;
                i++;
            }
        }
        return sb.toString();
    }
}