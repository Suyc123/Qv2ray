package N54;

import java.util.*;

public class Solution {

    Set<Character> set = new HashSet<>();
    List<Character> fA = new ArrayList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(!set.contains(ch)){
            fA.add(ch);
            set.add(ch);
        }else{
            fA.remove(Character.valueOf(ch));
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if(fA.size() == 0)
            return '#';
        return fA.get(0);
    }
}
