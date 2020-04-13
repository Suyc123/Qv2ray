package N41;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinueSequence(int sum){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(sum < 2)
            return res;
        int front = 1;
        int rear = 1;
        int curSum = 0;
        ArrayList<Integer> window = new ArrayList<Integer>();
        while(rear <= sum){
            if(curSum == sum){
                ArrayList<Integer> ans = new ArrayList<>(window);
                res.add(ans);
                curSum += rear;
                window.add(rear);
                rear ++;
            }
            while(curSum > sum && front < rear){
                curSum -= front;
                window.remove(Integer.valueOf(front));
                front ++;
            }
            if(curSum < sum){
                curSum += rear;
                window.add(rear);
                rear ++;
            }

        }
        return res;
    }
}
