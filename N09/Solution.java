package N09;

public class Solution {
    public int JumpFloor(int target){
        if(target < 2)
            return 1;
        int[] dp = new int[target];
        dp[0] = 1;
//        dp[1] = 2;
//        for(int i = 2; i < target; i ++){
//            dp[i] = 1;
//            for(int j = 1; j <= i; j ++)
//                dp[i] += dp[i - j];
//        }
        for(int i = 1; i < target; i ++)
            dp[i] = 2 * dp[i - 1];
        return dp[target - 1];
    }
}
