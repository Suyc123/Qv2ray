package N14;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public ListNode FindKthToTail(ListNode head, int k){
        List<ListNode> array = new ArrayList<>();
        ListNode tmp = head;
        int len = 0;
        while(tmp != null){
            array.add(tmp);
            tmp = tmp.next;
            len ++;
        }
        if(k > len)
            return null;
        return array.get(len - k + 1);
    }

    public ListNode FindKthToTail1(ListNode head, int k) {
        if(k < 1)
            return null;
        ListNode pre = head;
        ListNode post = head;
        for(int i = 0; i < k; i ++){
            if(post == null)
                return null;
            post = post.next;
        }
        while(post.next != null){
            pre = pre.next;
            post = post.next;
        }
        return pre;
    }

    class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
}
