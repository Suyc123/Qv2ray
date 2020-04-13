package N17;

public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2){
        if(root2 == null)
            return false;
        if(root1 == null)
            return false;
        return isSameTree(root1, root2) || isSameTree(root1.left, root2) || isSameTree(root1.right, root2);
    }

    public boolean isSameTree(TreeNode root1, TreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(root1.val == root2.val)
            return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
        else
            return isSameTree(root1.left, root2) || isSameTree(root1.right, root2);
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
