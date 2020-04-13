package N37;

public class test {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 5, 5, 6};
        int k = 5;
        Solution solution = new Solution();
        int res = solution.GetNumberOfK(array, k);
        System.out.println(res);
    }
}
