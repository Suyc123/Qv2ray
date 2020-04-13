package N58;

public class Solution {
    public boolean isSymmetrical(TreeNode root){
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        if(root.left != null && root.right != null){
            if(root.left.val != root.right.val)
                return false;
            return helper(root.left, root.right);
        }

        return false;
    }

    private boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if((left == null && right != null) || (left != null && right == null) || left.val != right.val)
            return false;
        return helper(left.left, right.right) && helper(left.right, right.left);
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
}
