package N40;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2){
        if(array.length < 2)
            return;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < array.length; i ++){
            if(set.contains(array[i])){
                set.remove(Integer.valueOf(array[i]));
            }else{
                set.add(array[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        if(it.hasNext())
            num1[0] = it.next();
        if(it.hasNext())
            num2[0] = it.next();
    }
}
