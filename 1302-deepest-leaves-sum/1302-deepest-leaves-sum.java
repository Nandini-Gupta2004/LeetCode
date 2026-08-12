 
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int size=q.size();
            sum=0;
            for(int i=0;i<size;i++){
                TreeNode a=q.poll();
                sum+=a.val;
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);                
            }
        }
        return sum;
    }
}