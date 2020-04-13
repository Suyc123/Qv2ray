package N40;

public class test {
    public static void main(String[] args){
        int[] array = {2,4,3,6,3,2,5,5};
        Solution solution = new Solution();
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        solution.FindNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
