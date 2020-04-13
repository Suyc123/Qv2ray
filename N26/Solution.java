package N26;

import java.util.Stack;

public class Solution {
    public TreeNode Convert(TreeNode root){
        if(root == null)
            return null;
        if(root.left == null && root.right == null)
            return root;
        TreeNode r = Convert(root.right);
        TreeNode l = Convert(root.left);
        if(l != null && r != null){
            TreeNode head = l;
            while(l.right != null)
                l = l.right;
            l.right = root;
            root.left = l;
            root.right = r;
            r.left = root;
            head.left = null;
            return head;
        }else if(r != null){
            root.right = r;
            r.left = root;
            root.left = null;
            return root;
        }else if(l != null){
            TreeNode head = l;
            while(l.right != null)
                l = l.right;
            l.right = root;
            root.left = l;
            root.right = null;
            return head;
        }
        return root;
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
