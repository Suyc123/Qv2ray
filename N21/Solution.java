package N21;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA){
        if(pushA.length == 0 && popA.length == 0)
            return true;
        Stack<Integer> stack = new Stack<>();

        int index = 0;
        for(int i = 0; i < pushA.length; i ++){
            stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek() == popA[index]){
                stack.pop();
                index ++;
            }
        }
        return index == popA.length;
    }
}
