class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] help=new int[m+n];
        int k=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                help[k++]=nums1[i];
                i++;
            }
            else{
                help[k++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            help[k++]=nums1[i];
            i++;
        }
        while(j<n){
            help[k++]=nums2[j++];
        }

        for(int a=0;a<m+n;a++){
            nums1[a]=help[a];
        }
    }
}