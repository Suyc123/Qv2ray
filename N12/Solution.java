package N12;

public class Solution {
    public double Power(double base, int exponent){
        if(base == 0.0)
            return 0.0;
        if(exponent == 0)
            return 1.0;
        double res = 1.0;
        boolean flag = exponent > 0;
        exponent = Math.abs(exponent);
        while(exponent-- > 0){
            res *= base;
        }
        if(!flag)
            res = 1 / res;
        return res;
    }

    public double Power1(double base, int exponent){
        if(base == 0.0)
            return 0.0;
        if(exponent == 0)
            return 1.0;
        if(exponent == 1)
            return base;
        boolean flag = exponent > 0;
        exponent = Math.abs(exponent);
        double res = Power1(base, exponent / 2);
        res = res * res;
        if(exponent % 2 == 1)
            res = res * base;
        if(!flag)
            res = 1 / res;
        return res;
    }
}
