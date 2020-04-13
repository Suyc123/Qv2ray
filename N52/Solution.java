package N52;


public class Solution {
    public boolean match(char[] str, char[] pattern){
        return helper(str, str.length - 1, pattern, pattern.length - 1);
    }

    private boolean helper(char[] str, int str_idx, char[] pattern, int p_idx){
        if(str_idx < 0 && p_idx < 0)
            return true;
        // 情况 ： ""   "a*b*c*"
        if(str_idx < 0){
            while(p_idx >= 0){
                if(pattern[p_idx] != '*')
                    return false;
                p_idx -= 2;
            }
            return true;
        }
        if(p_idx < 0)
            return false;
        if(pattern[p_idx] == '.'){
            return helper(str, str_idx - 1, pattern, p_idx - 1);
        }
        if(pattern[p_idx] == '*'){
            char pre = pattern[p_idx - 1];
            if(pre != '.' && pre != str[str_idx])
                return helper(str, str_idx, pattern, p_idx - 2);
            else{
                // 特殊情况 ： "aaa"  "aa*"
                return helper(str, str_idx - 1, pattern, p_idx)
                        || helper(str, str_idx, pattern, p_idx - 2);
            }
        }
        if(str[str_idx] == pattern[p_idx])
            return helper(str, str_idx - 1, pattern, p_idx - 1);
        else
            return false;
    }
}
