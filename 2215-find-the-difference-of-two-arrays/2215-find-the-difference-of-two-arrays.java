class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
         HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++) set1.add(nums1[i]);
         for(int i=0;i<nums2.length;i++) set2.add(nums2[i]);
           List<Integer> l1=new ArrayList<>();
             List<Integer> l2=new ArrayList<>();
         
           for (int num : set1) {
            if (!set2.contains(num)) {
                l1.add(num);
            }
        }

            for (int num : set2) {
            if (!set1.contains(num)) {
                l2.add(num);
            }
        } 
          ans.add(l1);
          ans.add(l2);
          return ans;
    }
}