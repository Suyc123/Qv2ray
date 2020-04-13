package N56;

import java.util.*;

public class Solution {
    public ListNode deleteDuplication(ListNode head){
        ListNode p = head;
        Map<Integer, Integer> map = new HashMap<>();
        while(p != null){
            map.put(p.val, map.getOrDefault(p.val, 0) + 1);
            p = p.next;
        }
        ListNode pre = head;
        p = head;
        while(p != null){
            if(map.get(p.val) > 1){
                if(p == head) {
                    head = p.next;
                    pre = head;
                    p = head;
                }else{
                    pre.next = p.next;
                    p = p.next;
                }
            }else{
                pre = p;
                p = p.next;
            }
        }
        return head;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}
