class Solution {
    public int reverse(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return ans;
    }
    public boolean isSameAfterReversals(int num) {
        int r=reverse(num);
        int a=reverse(r);
        if(num==a) return true;
        return false;
    }
}