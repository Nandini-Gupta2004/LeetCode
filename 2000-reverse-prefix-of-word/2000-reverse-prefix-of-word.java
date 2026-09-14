class Solution {
    public String reversePrefix(String word, char ch) {
         int j=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(ch==c){
                j=i;
                break;
            }
        }
        if(j==0) return word;
        StringBuilder sb=new StringBuilder();
        for(int i=j;i>=0;i--){
            sb.append(word.charAt(i));
        }

        for(int i=j+1;i<word.length();i++) sb.append(word.charAt(i));
        return sb.toString();
    }
}