public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0)
            return 0;
        if(index == 1)
            return 1;
        int[] arr = new int[index];
        arr[0] = 1;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        for(int i = 1; i < index; i++){
            arr[i] = min(arr[t2] * 2, min(arr[t3] * 3, arr[t5] * 5));
            if(arr[i] == arr[t2] * 2)
                t2++;
            if(arr[i] == arr[t3] * 3)
                t3++;
            if(arr[i] == arr[t5] * 5)
                t5++;
        }
        return arr[index - 1];
    }
    public int min(int a, int b){
        return (a > b)? b : a;
    }
}

Title:把只包含质因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。
求按从小到大的顺序的第N个丑数。

Algorithm analysis:
可以试着把数据带进去更好理解
