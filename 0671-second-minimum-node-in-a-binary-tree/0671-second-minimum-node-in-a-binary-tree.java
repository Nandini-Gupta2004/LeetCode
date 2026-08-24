/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> ls=new ArrayList<>();
        traverse(root,ls);
         Collections.sort(ls);
        int min = ls.get(0);

        for (int i = 1; i < ls.size(); i++) {
            if (ls.get(i) != min) {
                return ls.get(i);
            }
        }
        return -1;
    }

    public void traverse(TreeNode root, ArrayList<Integer> ls){
        if(root==null) return;
        traverse(root.left,ls);
        ls.add(root.val);
        traverse(root.right,ls);
    }
}