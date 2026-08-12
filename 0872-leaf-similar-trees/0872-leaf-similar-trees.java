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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null) return false;
        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        leaf(root1,ans1);
        leaf(root2,ans2);
        return ans1.equals(ans2);
    }
    public void leaf(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.val);
        leaf(root.left,ans);
        leaf(root.right,ans);
    }
}