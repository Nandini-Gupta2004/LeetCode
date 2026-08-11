class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        dfs(root, "", ans);

        return ans;
    }

    private void dfs(TreeNode root, String path, List<String> ans) {

        if (root == null)
            return;

        // Add current node to path
        if (path.equals("")) {
            path = path + root.val;
        } else {
            path = path + "->" + root.val;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        // Go left
        dfs(root.left, path, ans);

        // Go right
        dfs(root.right, path, ans);
    }
}