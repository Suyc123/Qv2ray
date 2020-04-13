package N32;

public class test {
    public static void main(String[] args){
        int[] nums = {3, 32, 321};
        Solution solution = new Solution();
        String res = solution.PrintMinNumber(nums);
        System.out.println(res);
        String a = "3";
        String b = "32a";
        System.out.println(Integer.valueOf(a));
        System.out.println(a.compareTo(b));
    }
}
