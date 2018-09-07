public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int total = array[0];
        int maxSum = array[0];
        if(array.length == 0)
            return 0;
        for(int i = 1; i < array.length; i++){
            if(total >= 1)
                total += array[i];
            else
                total = array[i];
            if(total > maxSum)
                maxSum = total;
        }
        return maxSum;
    }
}

title:The maximum sum of a contiguous subarray(son_array).

Algorithm analysis: look at these codes.
