package N15;

public class Solution {
    public ListNode ReverseList(ListNode head){
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        pre.next = null;
        while(cur != null){
            ListNode tmpCur = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmpCur;
        }
        return pre;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}
