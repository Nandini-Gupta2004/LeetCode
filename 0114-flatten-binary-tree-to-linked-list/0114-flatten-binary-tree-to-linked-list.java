class Solution {
    public void flatten(TreeNode root) {

        if (root == null)
            return;

        ArrayList<TreeNode> list = new ArrayList<>();

        preorder(root, list);

        // Connect nodes like a linked list
        for (int i = 0; i < list.size() - 1; i++) {

            TreeNode curr = list.get(i);
            TreeNode next = list.get(i + 1);

            curr.left = null;
            curr.right = next;
        }

        // Last node
        TreeNode last = list.get(list.size() - 1);
        last.left = null;
        last.right = null;
    }

    private void preorder(TreeNode root, ArrayList<TreeNode> list) {

        if (root == null)
            return;

        list.add(root);

        preorder(root.left, list);
        preorder(root.right, list);
    }
}