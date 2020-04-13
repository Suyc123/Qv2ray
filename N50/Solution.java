package N50;

import java.util.*;

public class Solution {
    public boolean duplicate(int[] numbers, int length, int[] duplication){
        if(length < 2)
            return false;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < length; i ++){
            if(set.contains(numbers[i])){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
