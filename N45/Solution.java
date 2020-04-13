package N45;

import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int[] nums){
        int len = nums.length;
        if(len < 2)
            return true;
        int num_zero = 0;
        for(int i = 0;  i < len; i ++){
            if(nums[i] == 0)
                num_zero ++;
        }
        Arrays.sort(nums);
        int num_space = 0; // 统计间隔的数量
        for(int i = 1; i < len; i ++){
            if(nums[i] == nums[i - 1] && nums[i] != 0)
                return false;
            if(nums[i] - nums[i - 1] > 1 && nums[i - 1] != 0){
                num_space += nums[i] - nums[i - 1] - 1;
            }
        }

        return num_space <= num_zero;

    }
}
