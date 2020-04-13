package N36;

import java.util.Set;
import java.util.HashSet;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        if(pHead1 == null || pHead2 == null)
            return null;
        Set<Integer> set = new HashSet<Integer>();
        while(pHead1 != null){
            set.add(pHead1.val);
            pHead1 = pHead1.next;
        }

        while(pHead2 != null){
            if(set.contains(pHead2.val)){
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }

    class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
}
