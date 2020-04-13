package N30;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] nums){
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = 0;
        max = Math.max(max, dp[0]);
        for(int i = 1; i < nums.length; i++){
            if(dp[i - 1] > 0)
                dp[i] = dp[i - 1] + nums[i];
            else
                dp[i] = nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
