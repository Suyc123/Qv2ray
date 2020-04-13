package N43;

public class Solution {
    public String LeftRotateString(String str, int n){
        if(str.length() <= 1)
            return str;
        int len = str.length();
        char[] res = new char[len];
        for(int i = 0; i < len; i ++){
            int idx = i - n;
            while(idx < 0)
                idx += len;
            res[idx] = str.charAt(i);
        }
        return new String(res);
    }
}
