class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]) && !ls.contains(nums2[i])){
                ls.add(nums2[i]);
            }
        }
         int[] ans = new int[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            ans[i] = ls.get(i);
        }

        return ans;
    }
}