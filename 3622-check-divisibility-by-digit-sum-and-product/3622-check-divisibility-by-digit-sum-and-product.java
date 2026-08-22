class Solution {
    public boolean checkDivisibility(int n) {
       int prod=1;
       int sum=0;
       int num=n;
       while(n>0){
        int rem=n%10;
        sum+=rem;
        prod *=rem;
        n=n/10;
       } 
       sum=sum+prod;
       if(num%sum==0) return true;
       return false;
    }
}