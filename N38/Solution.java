package N38;

/**
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */

import java.util.Queue;
import java.util.ArrayDeque;

public class Solution {
    public int TreeDepth(TreeNode root){
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        int depth = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            depth ++;
            while(len-- > 0){
                root = queue.poll();
                if(root.left != null)
                    queue.add(root.left);
                if(root.right != null)
                    queue.add(root.right);
            }
        }
        return depth;
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
