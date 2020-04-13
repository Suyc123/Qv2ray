package N45;

public class test {
    public static void main(String[] args){
        int[] nums = {1, 2, 8, 5, 0, 0};
        Solution solution = new Solution();
        boolean res = solution.isContinuous(nums);
        System.out.println(res);
    }
}
