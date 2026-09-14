class Solution {
    public int digitFrequencyScore(int n) {
        int temp=n;
        int sum =0;
        while(temp>0){
            int digit = temp%10;
            sum += digit;
            temp/=10;
        }return sum;
    }
}