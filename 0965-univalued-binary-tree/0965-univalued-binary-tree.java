class Solution {
    public boolean isUnivalTree(TreeNode root) {

        if (root == null) {
            return true;
        }

        int value = root.val;

        return check(root, value);
    }

    public boolean check(TreeNode root, int value) {

        if (root == null) {
            return true;
        }

        if (root.val != value) {
            return false;
        }

        return check(root.left, value)
            && check(root.right, value);
    }
}