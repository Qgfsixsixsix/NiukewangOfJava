public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        int step = 0;
        int i = -1;
        int count;
        int [] array = new int[n];
        count = n;
        if(n < 1 || m < 1)
            return -1;
        while(count > 0){
            i++;
            if(i >= n)
                i = 0;
            if(array[i] == -1)
                continue;
            step++;
            if(step == m){
                array[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;
    }
}

Title:
//其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,
//让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,
//然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,
//继续0...m-1报数....这样下去....直到剩下最后一个小朋友(0,n-1)

Algorithm analysis:
//模拟环，当走到数组的尽头时设i= 0;当取走那个数组时设array[-1] = -1;作为一个标记
//当循环时候，跳过-1，因为这表示已经不在这个环了，每走一步就+1，一直到循环的结尾
