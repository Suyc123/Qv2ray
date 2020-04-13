package N41;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args){
        int sum = 100;
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> res = solution.FindContinueSequence(sum);
        for(ArrayList ans : res){
            Iterator<Integer> it = ans.iterator();
            while(it.hasNext())
                System.out.print(it.next() + "  ");
            System.out.println();
        }
    }
}
