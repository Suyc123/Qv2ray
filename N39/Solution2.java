package N39;

import java.util.Deque;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 递归
 */


public class Solution2 {
    public boolean IsBalanced_Solution(TreeNode root){
        if(root == null)
            return true;
        int depth = Depth(root);
        return depth != -1;
    }

    private int Depth(TreeNode root){
        if(root == null)
            return 0;
        int left = Depth(root.left);
        if(left == -1)
            return -1;
        int right = Depth(root.right);
        if(right == -1)
            return -1;
        if(Math.abs(left - right) > 1)
            return -1;
        return 1 + Math.max(left, right);
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

