package N33;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        int res = 0;
        int i = 1;
        while(res < index){
            if(isUglyNumber(i))
                res ++;
            i ++;
        }
        return i;
    }

    private boolean isUglyNumber(int num){
        while(num % 2 == 0)
            num /= 2;
        while(num % 3 == 0)
            num /= 3;
        while(num % 5 == 0)
            num /= 5;
        return num == 1;
    }

    public int GetUglyNumber_Solution2(int index){
        if(index <= 0)
            return 0;
        int[] res = new int[index];
        int p2 = 0, p3 = 0, p5 = 0;
        res[0] = 1;
        for(int i = 0; i < index; i ++){
            res[i] = Math.min(res[p2] * 2, Math.min(res[p3] * 3, res[p5] * 5));
            if(res[i] == res[p2] * 2)
                p2 ++;
            if(res[i] == res[p3] * 3)
                p3 ++;
            if(res[i] == res[p5] * 5)
                p5 ++;
        }
        return res[index - 1];
    }
}
