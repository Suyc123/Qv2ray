package N11;

public class Solution {
    public int NumberOf1(int n) {
        String n2String = Integer.toBinaryString(n);
        //System.out.println(n2String);
        int res = 0;
        for(char c : n2String.toCharArray()){
            if(c == '1')
                res ++;
        }

        return res;
    }
}