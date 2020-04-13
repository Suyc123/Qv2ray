package N20;

/**
 * 压缩还原法
 * 空间复杂度 O(1)
 */

import java.util.Stack;

public class Solution2 {

    Stack<Integer> stack = new Stack<Integer>();
    int min;

    public void push(int node){
        if(stack.isEmpty()){
            min = node;
            stack.push(node - min);
        }else{
            int diff = node - min;
            stack.push(diff);
            if(diff < 0)
                min = node;
        }
    }

    public void pop(){
        if(stack.isEmpty())
            return;
        int diff = stack.pop();
        if(diff < 0){
            min = min - diff;
        }
    }

    public int top(){
        if(stack.isEmpty())
            return -1;
        int diff = stack.peek();
        if(diff < 0){
            return min;
        }
        return min + diff;
    }

    public int min(){
        if(stack.isEmpty())
            return -1;
        return min;
    }
}
