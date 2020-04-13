package N01;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Solution {
    public boolean Find(int target, int[][] array){
        if(array.length == 0)
            return false;
        int m = array.length;
        int n = array[0].length;
        int breakPoint = 0;
        for(int i = 0; i < Math.min(m, n); i ++){
            if(array[i][i] == target)
                return true;
            if(array[i][i] > target){
                if(i == 0)
                    return false;
                breakPoint = i;
                break;
            }
        }
        for(int i = 0; i < breakPoint; i ++)
            for(int j = breakPoint; j < n; j ++){
                if(array[i][j] == target)
                    return true;
                if(array[i][j] > target)
                    break;
            }
        for(int i = breakPoint; i < m; i ++)
            for(int j = 0; j < breakPoint; j ++){
                if(array[i][j] == target)
                    return true;
                if(array[i][j] > target)
                    break;
            }

        return false;
    }
}
