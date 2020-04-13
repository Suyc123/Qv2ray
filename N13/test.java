package N13;

public class test {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        solution.reOrderArray(array);
        for(int num : array){
            System.out.print(num + "  ");
        }
    }
}
