package N31;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n){
        if(n < 1)
            return 0;
        if(n < 10)
            return 1;
        int res = 0;
        int high = 1;
        while(n / high >= 10){
            high *= 10;
        }
        for(int i = 1; i < high; i = i * 10){
            res = res * 9 + i;
        }
        int highest = n / high;
        res = res * highest;
        if(highest > 1)
            res += high;
        else if(highest == 1)
            res = res + (n - high) + 1;
        return res + NumberOf1Between1AndN_Solution(n % high);

    }
}
