class Solution {
    public final TreeNode getTargetCopy(
        final TreeNode original,
        final TreeNode cloned,
        final TreeNode target) {

        if (original == null)
            return null;

        // Target found in original
        if (original == target)
            return cloned;

        // Search left subtree
        TreeNode left = getTargetCopy(
            original.left,
            cloned.left,
            target
        );

        if (left != null)
            return left;

        // Search right subtree
        return getTargetCopy(
            original.right,
            cloned.right,
            target
        );
    }
}