package N46;

public class Solution {
    public int LastRemaining_Solution(int n, int m){
        if(n <= 0 || m < 0)
            return -1;
        CircleLinkedList cll = new CircleLinkedList(0);
        CircleLinkedList head = cll;
        for(int i = 1; i < n; i ++){
            CircleLinkedList newCll = new CircleLinkedList(i);
            head.next = newCll;
            head = head.next;
        }
        head.next = cll;
        CircleLinkedList pre = head;
        head = cll;
        while(head != pre){
            for(int i = 1; i < m; i ++){
                head = head.next;
                pre = pre.next;
            }
            head = head.next;
            pre.next = head;
        }
        return head.val;
    }

    class CircleLinkedList{
        int val;
        CircleLinkedList next;
        CircleLinkedList(int val){
            this.val = val;
        }
    }
}
