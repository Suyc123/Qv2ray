package N28;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array){
        if(array.length == 0)
            return 0;
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for(int num : array){
            dict.put(num, dict.getOrDefault(num, 0) + 1);
            if(dict.get(num) > array.length >> 1)
                return num;
        }
        return 0;
    }
}
