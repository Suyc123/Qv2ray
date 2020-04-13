package N07;

public class Solution {
    public int Fibonacci(int n) {
        if(n < 3)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        int i = 2;
        while(i <= n){
            dp[i] = dp[i - 1] + dp[i - 2];
            i ++;
        }
        return dp[n];
    }
}