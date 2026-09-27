class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] ans=new int[word.length()];
                long rem = 0;

        for(int i=0;i<word.length();i++){
            int n=word.charAt(i)-'0';
             rem = (rem * 10 + n) % m;

            if (rem == 0)
                ans[i] = 1;
            else
                ans[i] = 0;
        }
        return ans;
    }
}