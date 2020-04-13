package N27;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {
    public ArrayList<String> Permutation(String str){
        if(str.length() == 0)
            return new ArrayList<String>();
        ArrayList<String> res = backtrace(new StringBuilder(str));
        Collections.sort(res);
        return res;
    }

    private ArrayList<String> backtrace(StringBuilder str){
        ArrayList<String> res = new ArrayList<String>();
        if(str.length() == 1){
            res.add(str.toString());
            return res;
        }
        for(int i = 0; i < str.length(); i ++){
            // 与第一个交换， 如果两个字母相同，则不需要交换
            if(i == 0 || str.charAt(i) != str.charAt(0)){
                swap(str, 0, i);
                ArrayList<String> sub_res = backtrace(new StringBuilder(str.substring(1)));
                for(String sub_str : sub_res)
                    res.add(str.substring(0, 1) + sub_str);
                // 回溯法，要将字符串回溯到原来的状态
                swap(str, 0, i);
            }
        }
        return res;
    }

    private void swap(StringBuilder str, int i, int j){
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
}
