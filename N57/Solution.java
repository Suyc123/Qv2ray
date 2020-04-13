package N57;

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)
            return null;
        if(pNode.right != null){
            TreeLinkNode root = pNode.right;
            while(root.left != null){
                root = root.left;
            }
            return root;
        }
        if(pNode.next != null){
            while(pNode.next != null && pNode != pNode.next.left){
                pNode = pNode.next;
            }
            return pNode.next;
        }
        return null;
    }

    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}