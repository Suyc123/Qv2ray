package N59;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，
 * 其他行以此类推。
 */

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root){
        if(root == null)
            return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean flag = true;    // 标识 应该从右往左(false)  还是从左往右(true)
        while(!queue.isEmpty()){
            int size = queue.size();
            if(flag){
                ArrayList<Integer> ans = new ArrayList<>();
                while(size --  > 0){
                    TreeNode top = queue.poll();
                    ans.add(top.val);
                    if(top.left != null)
                        queue.add(top.left);
                    if(top.right != null)
                        queue.add(top.right);
                }
                res.add(ans);
            }else{
                Stack<Integer> stack = new Stack<Integer>();
                ArrayList<Integer> ans = new ArrayList<>();
                while(size -- > 0){
                    TreeNode top = queue.poll();
                    stack.add(top.val);
                    if(top.left != null)
                        queue.add(top.left);
                    if(top.right != null)
                        queue.add(top.right);
                }
                while(!stack.isEmpty()){
                    ans.add(stack.pop());
                }
                res.add(ans);
            }
            flag = !flag;
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
