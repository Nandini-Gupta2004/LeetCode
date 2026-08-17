 
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
         if(root==null) return root;
         if(root.val>key) root.left= deleteNode(root.left,key);
        else if(root.val<key) root.right= deleteNode(root.right,key);
         else{
            //0 child
            if(root.left==null && root.right==null) return null;

            //1 child
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            //2 child
            TreeNode pre=root.left;
            while(pre.right!=null) pre=pre.right;
            root.left=deleteNode(root.left,pre.val);
            pre.left=root.left;
            pre.right=root.right;
            return pre;
         }
         return root;
    }
}