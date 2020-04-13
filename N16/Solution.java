package N16;

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2){
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1.val > list2.val){
            ListNode tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        ListNode head = list1;
        ListNode pre = list1;
        list1 = list1.next;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                ListNode tmp = list2.next;
                pre.next = list2;
                list2.next = list1;
                pre = pre.next;
                list2 = tmp;
            }else{
                pre = pre.next;
                list1 = list1.next;
            }
        }
        if(list1 == null){
            pre.next = list2;
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
