package N39;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 递归
 */

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root){
        if(root == null)
            return true;
        Res res = helper(root);
        return res.isBalanced;
    }

    public Res helper(TreeNode root){
        if(root == null)
            return new Res(true, 0);
        Res left = helper(root.left);
        Res right = helper(root.right);
        return new Res(left.isBalanced && right.isBalanced
                && Math.abs(left.Depth - right.Depth) <= 1,
                Math.max(left.Depth, right.Depth) + 1);
    }

    class Res{
        boolean isBalanced;
        int Depth;
        Res(boolean isBalanced, int Depth){
            this.isBalanced = isBalanced;
            this.Depth = Depth;
        }
    }

    class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
}
