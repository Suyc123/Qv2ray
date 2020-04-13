package N30;

public class test {
    public static void main(String[] args){
        int[] nums = {1, 2, -1, 3 ,4};
        Solution solution = new Solution();
        int res = solution.FindGreatestSumOfSubArray(nums);
        System.out.println(res);
    }
}
