package N51;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] multiply(int[] A) {
//        List<Integer> zeroIdx = new ArrayList<Integer>(); // 记录 0 的索引
        int zeroCnt = 0;
        int A_mul = 1;
        for( int i = 0; i< A.length; i ++){
            if(A[i] != 0){
                A_mul *= A[i];
            }else{
                zeroCnt ++;
            }
        }
        int[] B = new int[A.length];
        if(zeroCnt > 1)
            return B;
        if(zeroCnt != 0){
            for(int i = 0; i < A.length; i ++){
                if(A[i] == 0)
                    B[i] = A_mul;
            }
        }else{
            for(int i = 0; i < A.length; i ++){
                B[i] = div(A_mul, A[i]);
            }
        }

        return B;
    }

    private int div(int x, int y){
        boolean flag = true;    // 判断 输出为 + 还是 -
        if((x < 0 && y > 0) || (x > 0 && y < 0))
            flag = false;
        x = Math.abs(x);
        y = Math.abs(y);
        int left_num = x;
        int res = 0;
        while(left_num >= y){
            int m = 1;
            while(y * m <= left_num >> 1)
                m = m << 1;
            res += m;
            left_num -= m * y;
        }
        return flag ? res : -res;
    }
}
