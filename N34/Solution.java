package N34;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */

public class Solution {
    public int FirstNotRepeatingChar(String str){
        int[] alpha = new int[52];
        int[] index = new int[52];
        for(int i = 0; i < str.length(); i ++){
            char c = str.charAt(i);
            int idx = 0;
            if(c > 96)
                idx = c - 'A' - 6;
            else
                idx = c - 'A';
            alpha[idx] += 1;
            index[idx] = i;
        }
        int res = str.length();
        for(int i = 0; i < 52; i ++){
            if(alpha[i] == 1)
                res = Math.min(res, index[i]);
        }
        if(res == str.length())
            return -1;
        return res;
    }
}
