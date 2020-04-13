package N49;

public class Solution {
    public int StrToInt(String str) {
        if(str.length() < 1)
            return 0;
        int i = 0;
        while(str.charAt(i) == ' ' || str.charAt(i) == '0'){
            i ++;
        }

        long res = 0;
        boolean flag = true;
        if(str.charAt(i) == '-' || str.charAt(i) == '+'){
            if(str.charAt(i) == '-')
                flag = false;
            i ++;
        }
        while(i < str.length()){
            char c = str.charAt(i);
            if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                return 0;
            res = 10 * res + c - '0';
            if(flag && res > Integer.MAX_VALUE)
                return 0;
            if(!flag && res > -(long)(Integer.MIN_VALUE))
                return 0;
            i ++;
        }
        if(!flag)
            res = -res;
        return (int)res;


    }
}
