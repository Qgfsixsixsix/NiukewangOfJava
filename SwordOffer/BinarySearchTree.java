题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
      如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同

解题思路：二叉搜索树就是右子树 <= 根结点 <= 左子树，根据这个性质递归下去

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        if(sequence.length == 1) return true;
        return judge(sequence, 0, sequence.length - 1);
    }
    public static boolean judge(int [] arr, int start, int end){
        if(start >= end) return true;// 递归停止的条件
        int i = start;
        while(arr[i] < arr[end]){
            i++;
        }
        for(int j = i; j < end; j++){
            if(arr[j] < arr[end]) return false;
        }
        return judge(arr, start, i - 1) && judge(arr, i, end - 1);
    }
}
