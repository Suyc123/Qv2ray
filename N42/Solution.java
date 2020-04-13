package N42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if(array.length < 2)
            return new ArrayList<Integer>();
        int[] res = {sum, sum};
        boolean flag = false;
        Set<Integer> set = new HashSet<Integer>();
        for(int num : array)
            set.add(num);
        for(int i = 0; i < array.length; i ++){
            if(set.contains(sum - array[i]) && array[i] != (sum - array[i])){
                if(array[i] * (sum - array[i]) < res[0] * res[1]){
                    res[0] = array[i];
                    res[1] = sum - array[i];
                    flag = true;
                }
            }
        }

        ArrayList<Integer> resList = new ArrayList<Integer>();
        if(!flag)
            return resList;
        resList.add(res[0]);
        resList.add(res[1]);
        return resList;

    }
}
