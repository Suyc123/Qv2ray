package N23;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        return helper(sequence, 0, sequence.length);
    }

    private boolean helper(int[] sequence, int start, int end){
        if(end - start <= 1)
            return true;
        if(end - start == 2)
            return sequence[end - 1] > sequence[start];
        int root = end - 1;
        while(root > start && sequence[root] >= sequence[end - 1])
            root --;
        root ++;
        return helper(sequence, start, root) && helper(sequence, root, end - 1);
    }
}
