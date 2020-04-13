package N67;

/**
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */

public class Solution {
    public int cutRope(int target){
        if(target <= 1){
            return 1;
        }
        if(target == 2)
            return 1;
        if(target == 3)
            return 2;
        return helper(target);
    }
    public int helper(int target) {
        if(target < 4)
            return target;

        int max = 1;
        for(int i = 1; i < target / 2 + 1; i ++){
            max = Math.max(helper(i) * helper(target - i), max);
        }
        return max;
    }
}
