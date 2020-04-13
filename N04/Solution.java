package N04;

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in){
        // 1,2,4,7,3,5,6,8 pre
        // 4,7,2,1,5,3,8,6 in
        return helper(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode helper(int[] pre, int pres, int pree,int[] in, int ins, int ine){
        if(pree < pres)
            return null;
        if(pres == pree)
            return new TreeNode(pre[pres]);
        TreeNode root = new TreeNode(pre[pres]);
        for(int i = ins; i <= ine; i ++){
            if(in[i] == pre[pres]){
                root.left = helper(pre, pres + 1, pres + i - ins, in, ins, i - 1);
                root.right = helper(pre, pree + i - ins + 1, pree, in, i + 1, ine);
            }
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
