package N60;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */

import java.util.*;

public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode root) {
        if(root == null)
            return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> ans = new ArrayList<>();
            while (size-- > 0) {
                TreeNode top = queue.poll();
                ans.add(top.val);
                if (top.left != null)
                    queue.add(top.left);
                if (top.right != null)
                    queue.add(top.right);
            }
            res.add(ans);
        }
        return res;
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
