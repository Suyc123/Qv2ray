package N24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 回溯法
 */

public class Solution {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
            return res;
        LinkedList<Integer> ans = new LinkedList<>();
        ans.add(root.val);
        backtrace(root, target, root.val, new LinkedList<Integer>());
        return res;
    }

    private void backtrace(TreeNode root, int target, int curSum, LinkedList<Integer> ans){
        if(root.left == null && root.right == null){
            if(curSum == target){
                res.add(new ArrayList<Integer>(ans));
            }
            return;
        }
        if(root.left != null){
            ans.add(root.left.val);
            backtrace(root.left, target, curSum + root.left.val, ans);
            ans.removeLast();
        }
        if(root.right != null){
            ans.add(root.right.val);
            backtrace(root.right, target, curSum + root.right.val, ans);
            ans.removeLast();
        }
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
