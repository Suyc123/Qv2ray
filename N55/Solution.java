package N55;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        Set<ListNode> set = new HashSet<>();
        while(pHead != null){
            if(set.contains(pHead)){
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}
