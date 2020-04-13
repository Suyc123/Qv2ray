package N27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public ArrayList<String> Permutation(String str){
        if(str.length() == 0)
            return new ArrayList<String>();
        if(str.length() == 1){
            ArrayList<String> res = new ArrayList<String>();
            res.add(str);
            return res;
        }
        Set<String> res = new HashSet<String>();

        int len = str.length();
        for(int i = 0; i < len; i ++){
            for(int j = i; j < len; j ++){
                res.add(swap(str, i, j));
            }
        }
        ArrayList<String> ans = new ArrayList<>(res);
        Collections.sort(ans);
        return ans;
    }

    private String swap(String str, int i, int j){
        StringBuilder str1 = new StringBuilder(str);
        str1.setCharAt(i, str.charAt(j));
        str1.setCharAt(j, str.charAt(i));
        return str1.toString();
    }
}
