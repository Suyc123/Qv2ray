package N35;

/**
 * 归并排序思想
 */

public class Solution {
    int cnt = 0;
    public int InversePairs(int[] nums){
        int n = nums.length;
        if(n < 2)
            return 0;
        mergeSorted(nums, 0, n - 1);
        return cnt;
    }

    private void mergeSorted(int[] nums, int left, int right){
        if(right <= left)
            return ;
        int mid = (left + right) >> 1;
        mergeSorted(nums, left, mid);
        mergeSorted(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
    private void merge(int[] nums, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int l = left, r = mid + 1;
        int i = 0;
        while(l <= mid && r <= right){
            if(nums[l] > nums[r]){
                cnt = (cnt + mid - l + 1) % 1000000007;
                temp[i ++] = nums[r ++];
            }else{
                temp[i ++] = nums[l ++];
            }
        }
        while(l <= mid)
            temp[i ++] = nums[l ++];
        while(r <= right)
            temp[i ++] = nums[r ++];
        for(int j = 0; j < temp.length; j ++)
            nums[left + j] = temp[j];
    }
}
