class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;

        return build(0, n - 1, 0, n - 1, inorder, preorder);
    }

    public TreeNode build(int preLo, int preHi,
                          int inLo, int inHi,
                          int[] inorder, int[] preorder) {

        // No elements
        if (preLo > preHi) {
            return null;
        }

        // First element of preorder is root
        int val = preorder[preLo];

        TreeNode root = new TreeNode(val);

        // Find root in inorder
        int r = 0;

        for (int i = inLo; i <= inHi; i++) {
            if (inorder[i] == val) {
                r = i;
                break;
            }
        }

        // Number of elements in left subtree
        int cnt = r - inLo;

        // Build left subtree
        root.left = build(
            preLo + 1,
            preLo + cnt,
            inLo,
            r - 1,
            inorder,
            preorder
        );

        // Build right subtree
        root.right = build(
            preLo + cnt + 1,
            preHi,
            r + 1,
            inHi,
            inorder,
            preorder
        );

        return root;
    }
}