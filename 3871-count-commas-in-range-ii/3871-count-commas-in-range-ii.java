 class Solution {
    public long countCommas(long n) {
        
        long ans = 0;
        long start = 1000;
        int len = 4;

        while (start <= n) {
            
            long end = Math.min(n, start * 10 - 1);
            
            long commas = (len - 1) / 3;
            
            ans += (end - start + 1) * commas;
            
            start *= 10;
            len++;
        }

        return ans;
    }
}