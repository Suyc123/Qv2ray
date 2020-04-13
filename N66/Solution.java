package N66;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */

import java.util.Stack;

public class Solution {
    public int movingCount(int m, int n, int k){
        if(k < 0 || m <= 0 || n <= 0)
            return 0;

        int[] ROWs = {0, 0, 1, -1};
        int[] COLs = {1, -1, 0, 0};

        boolean[][] isVisited = new boolean[m][n];
        Stack<Cor> stack = new Stack<Cor>();
        stack.push(new Cor(0, 0));
        isVisited[0][0] = true;
        int cnt = 1;
        while(!stack.isEmpty()){
            Cor top = stack.pop();
            int row = top.row;
            int col = top.col;

            for(int i = 0; i < 4; i ++){
                int nr = row + ROWs[i];
                int nc = col + COLs[i];
                int nr_h = nr / 10;
                int nr_l = nr % 10;
                int nc_h = nc / 10;
                int nc_l = nc % 10;
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && nr_h + nr_l + nc_h + nc_l <= k){
                    if(!isVisited[nr][nc]){
                        stack.push(new Cor(nr, nc));
                        isVisited[nr][nc] = true;
                        cnt ++;
                    }
                }
            }

        }
        return cnt;

    }
    class Cor{
        int row;
        int col;
        Cor(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
}
