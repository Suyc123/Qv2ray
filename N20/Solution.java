package N20;

/**
 * 双栈实现
 * 空间复杂度 O(n)
 */

import java.util.Stack;

public class Solution {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public void push(int node){
        stack.push(node);
        if(minStack.isEmpty())
            minStack.push(node);
        else{
            minStack.push(Math.min(minStack.peek(), node));
        }
    }

    public void pop(){
        if(stack.isEmpty())
            return;
        stack.pop();
        minStack.pop();
    }

    public int top(){
        if(stack.isEmpty())
            return -1;
        return stack.peek();
    }

    public int min(){
        if(stack.isEmpty())
            return -1;
        return minStack.peek();
    }
}
