package N63;

/**
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */

import java.util.*;

public class Solution {
    List<Integer> data = new ArrayList<>();
    public void Insert(Integer num) {
        if(data == null)
            data.add(num);
        else{
            int i = 0;
            for(; i < data.size(); i ++){
                if(num > data.get(i))
                    break;
            }
            data.add(i, num);
        }
    }

    public Double GetMedian() {
        int len = data.size();
        if(len == 0)
            return 0.;
        double mid ;
        if(len % 2 == 0){
            mid = ((double)data.get(len / 2 - 1) + (double)data.get(len / 2)) / 2;
        }else{
            mid = data.get(len / 2);
        }
        return mid;

    }
}
