package N13;

public class Solution {
    public void reOrderArray(int[] array){
        // 1, 2, 3, 4, 5, 6, 7
        for(int i = 0; i < array.length; i ++){
            if(array[i] % 2 == 1){
                int j = i;
                while(j > 0){
                    if(array[j - 1] % 2 == 0){
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                    j --;
                }
            }
        }
    }
}
