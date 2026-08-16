 class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {

            TreeNode curr = new TreeNode(preorder[i]);
            TreeNode temp = root;

            while (true) {

                if (curr.val < temp.val) {

                    if (temp.left == null) {
                        temp.left = curr;
                        break;
                    }

                    temp = temp.left;

                } else {

                    if (temp.right == null) {
                        temp.right = curr;
                        break;
                    }

                    temp = temp.right;
                }
            }
        }

        return root;
    }
}