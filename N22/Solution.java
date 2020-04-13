package N22;

import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
         ArrayList<Integer> res = new ArrayList<>();
         if(root == null)
             return res;
         Queue<TreeNode> queue = new ArrayDeque<>();
         queue.offer(root);
         while(!queue.isEmpty()){
             int len = queue.size();
             while(len -- > 0){
                 root = queue.poll();
                 res.add(root.val);
                 if(root.left != null)
                     queue.offer(root.left);
                 if(root.right != null)
                     queue.offer(root.right);
             }
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
