package N65;

public class test {
    public static void main(String[] args){
        String m = "AAAAAAAAAAAA";
        char[] matrix = m.toCharArray();
        int rows = 3;
        int cols = 4;
        String s = "AAAAAAAAAAAA";
        char[] str = s.toCharArray();
        Solution solution = new Solution();
        boolean res = solution.hasPath(matrix, rows, cols, str);
        System.out.println(res);

    }
}
