import java.util.*;

class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    public int next() {
        TreeNode node = stack.pop();

        // After visiting node, process its right subtree
        pushLeft(node.right);

        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeft(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}