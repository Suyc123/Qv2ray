package N65;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 */

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix.length == 0)
            return false;
        if (str.length > rows * cols)
            return false;
        char[][] m = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = matrix[i * cols + j];
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

        boolean[][] isUsed = new boolean[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                if (backtrace(m, i, j, str, 0, isUsed))
                    return true;
                isUsed[i][j] = false;
            }
        return false;
    }

    private boolean backtrace(char[][] matrix, int row, int col, char[] str, int idx, boolean[][] isUsed) {
        if (idx == str.length - 1)
            return str[idx] == matrix[row][col];
        if (matrix[row][col] != str[idx])
            return false;
        int[] ROWs = {0, 0, 1, -1};
        int[] COLs = {1, -1, 0, 0};
        isUsed[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int nr = row + ROWs[i];
            int nc = col + COLs[i];
            if (nr >= 0 && nr < matrix.length && nc >= 0 && nc < matrix[0].length && !isUsed[nr][nc]) {
                if (backtrace(matrix, nr, nc, str, idx + 1, isUsed))
                    return true;
            }
        }
        isUsed[row][col] = false;
        return false;
    }
}
