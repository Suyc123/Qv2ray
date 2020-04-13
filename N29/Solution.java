package N29;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k){
        if(nums.length < k || k == 0)
            return new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i ++)
            res.add(nums[i]);
        for(int i = k; i < nums.length; i ++){
            int maxIndex = -1;
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < k; j ++){
                if(max < res.get(j)){
                    max = res.get(j);
                    maxIndex = j;
                }
            }
            if(res.get(maxIndex) > nums[i])
                res.set(maxIndex, nums[i]);
        }
        return res;
    }
}
