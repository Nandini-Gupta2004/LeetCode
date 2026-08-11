class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        view(root, 0, ans);

        return ans;
    }

    private void view(TreeNode root, int level, List<Integer> ans) {

        if (root == null)
            return;

        // First node we see at this level
        if (level == ans.size()) {
            ans.add(root.val);
        }

        // Right first
        view(root.right, level + 1, ans);

        // Then left
        view(root.left, level + 1, ans);
    }
}