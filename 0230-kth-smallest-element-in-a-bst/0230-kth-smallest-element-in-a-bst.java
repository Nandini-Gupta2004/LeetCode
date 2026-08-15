 class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);

        return ans.get(k - 1);
    }

    public void dfs(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) return;

        dfs(root.left, ans);
        ans.add(root.val);
        dfs(root.right, ans);
    }
}