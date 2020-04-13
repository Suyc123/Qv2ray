package N32;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String PrintMinNumber(int[] numbers){
        if(numbers.length == 0)
            return "";
        if(numbers.length == 1)
            return String.valueOf(numbers[0]);
        List<String> nums = new ArrayList<String>();
        for(int num : numbers)
            nums.add(String.valueOf(num));
        return helper(nums);
    }

    private String helper(List<String> numbers){
        if(numbers.size() == 0)
            return "";
        if(numbers.size() == 1)
            return numbers.get(0);
        String min = numbers.get(0);
        for(String num : numbers){
            if(Integer.valueOf(min) > Integer.valueOf(num))
                min = num;
        }
        numbers.remove(min);
        return min + helper(numbers);

    }


    /**
     *
     * @param m
     * @param n
     * @return  1 : m > n; 0 : m == n; -1 : m < n
     */
    private int compare(int m, int n){
        String mStr = String.valueOf(m);
        String nStr = String.valueOf(n);
        int i = 0;
        for(; i < mStr.length() && i < nStr.length(); i ++){
            if(mStr.charAt(i) > nStr.charAt(i))
                return 1;
            if(mStr.charAt(i) < nStr.charAt(i))
                return -1;
        }
        if(i == mStr.length() && i == nStr.length())
            return 0;
        if(i == mStr.length())
            return 1;
        if(i == nStr.length())
            return -1;
        return 0;
    }
}
