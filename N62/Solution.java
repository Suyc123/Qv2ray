package N62;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */

import java.util.*;
public class Solution {
    TreeNode KthNode(TreeNode root, int k) {
        if(k <= 0 || root == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();

        // 中序遍历为按照从小到大顺序输出
        while(root != null || !stack.isEmpty()){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop();
                if(--k <= 0)
                    return root;
                root = root.right;

            }
        }
        return null;
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
