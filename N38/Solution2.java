package N38;

/**
 *  输入一棵二叉树，求该树的深度。
 *  从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 递归
 */

public class Solution2 {
    public int TreeDepth(TreeNode root){
        if(root == null)
            return 0;
        int Depth_L = TreeDepth(root.left);
        int Depth_R = TreeDepth(root.right);
        return Math.max(Depth_L, Depth_R) + 1;
    }

    class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
}
