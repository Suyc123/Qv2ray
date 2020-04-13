package N19;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix.length == 0)
            return res;
        int x_start = 0;
        int x_end = matrix.length;
        int y_start = 0;
        int y_end = matrix[0].length;

        while(x_start < x_end && y_start < y_end){
            int up_row = x_start;
            int right_col = y_end - 1;
            int down_row = x_end - 1;
            int left_col = y_start;
            for(int j = left_col; j <= right_col; j ++)
                res.add(matrix[up_row][j]);
            for(int i = up_row + 1; i <= down_row; i ++)
                res.add(matrix[i][right_col]);

            for(int j = right_col - 1; j >= left_col && up_row < down_row; j --)
                res.add(matrix[down_row][j]);
            for(int i = down_row - 1; i > up_row && left_col < right_col; i --)
                res.add(matrix[i][left_col]);
            x_start ++;
            x_end --;
            y_start ++;
            y_end --;
        }
        return res;
    }
}
