package N27;

import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        String str = "abc";
        Solution2 solution = new Solution2();
        ArrayList<String> res = solution.Permutation(str);
        for(String s : res)
            System.out.println(s);
        System.out.println(res.size());
    }
}
