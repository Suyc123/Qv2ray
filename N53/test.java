package N53;

public class test {
    public static void main(String[] args){
        String str_1 = "-1E+2";
        char[] str = str_1.toCharArray();
        Solution solution = new Solution();
        boolean res = solution.isNumberic(str);
        System.out.println(res);
    }
}
