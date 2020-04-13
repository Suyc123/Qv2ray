package N61;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 *
 * 二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，
 * 从而使得内存中建立起来的二叉树可以持久保存。
 * 序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，
 * 序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#），
 * 以 ！ 表示一个结点值的结束（value!）。
 *
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 */

public class Solution {
    int idx = -1;
    String Serialize(TreeNode root) {
        if(root == null)
            return "#";
        return root.val + "!" + Serialize(root.left) + "!" + Serialize(root.right);

    }
    TreeNode Deserialize(String str) {
        String[] s = str.split("!");
        idx ++;
        if(idx > s.length)
            return null;
        TreeNode root = null;
        if(!s[idx].equals("#")){
            root = new TreeNode(Integer.parseInt(s[idx]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
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
