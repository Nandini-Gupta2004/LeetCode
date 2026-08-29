class Solution {
    public int findClosest(int x, int y, int z) {
         int ist=0;
        int sec=0;
        if(x<z) ist=z-x;
        if(y<z) sec=z-y;
        if(y>z) sec=y-z;
        if(x>z) ist=x-z; 
        if(ist==sec) return 0;
        if(ist<sec) return 1;
        return 2;
    }
}