package N64;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口， 他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        if(size > num.length || size < 1)
            return new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<>();
        int front = 0;
        int rear = front + size - 1;
        while(rear < num.length){
            int max = num[front];
            for(int i = front; i <= rear; i ++)
                max = Math.max(max, num[i]);
            res.add(max);
            rear ++;
            front ++;
        }
        return res;
    }
}
