class Solution {
    public boolean isPalindrome(int x) {
        // String s=Integer.toString(x);
        // for(int i=0;i<s.length()/2;i++){
        //     if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        //         return false;
        //     }
        // }
        // return true;
        if(x<0) return false;
        int num=x;
        int n=0;
        while(x>0){
            int rem=x%10;
            n=n*10+rem;
            x=x/10;
        }
        return num==n;
    }
}