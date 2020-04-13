package N37;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 二分法查找
 */

public class Solution {
    public int GetNumberOfK(int[] array, int k){
        if(array.length == 0)
            return 0;
        return helper(array, 0, array.length, k);
    }

    private int helper(int[] array, int begin, int end, int k){
        if(end - begin <= 0)
            return 0;
        int mid = (begin + end) / 2;
        int cnt = 0;
        if(array[mid] == k)
            cnt ++;
        return cnt + helper(array, begin, mid, k) + helper(array, mid + 1, end, k);
    }
}
