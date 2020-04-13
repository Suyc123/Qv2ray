package N35;

public class test {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 0};
        Solution solution = new Solution();
        int res = solution.InversePairs(nums);
        System.out.println(res);
    }
}
