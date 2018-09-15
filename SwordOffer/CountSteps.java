public class Solution {
    public int movingCount(int threshold, int rows, int cols){
        boolean [][] bl = new boolean[rows][cols];
        return CountSteps(threshold, rows, cols, 0, 0, bl);
    }
    public int CountSteps(int threshold, int rows, int cols, int row, int col, boolean[][] bl){
        if(row < 0 || row >= rows || col < 0 || col >= cols || bl[row][col] || digit(row) + digit(col) > threshold)
            return 0;
        bl[row][col] = true;
        return CountSteps(threshold, rows, cols, row + 1, col, bl) + 
               CountSteps(threshold, rows, cols, row - 1, col, bl) + 
               CountSteps(threshold, rows, cols, row, col - 1, bl) + 
               CountSteps(threshold, rows, cols, row, col + 1, bl) + 
               1;//这里是计算走了多少格子，+1说明走了(0,0)
    }
    public int digit(int n){
        int count = 0;
        while(n != 0){
            count = count + n % 10;//数位就是把各个位的数相加
            n = n / 10;
        }
        return count;
    }
}


Tilte:
//地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
//每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 
//例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
//因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？

Algorithm analysis:
//典型的回溯法例子，可以通过代码理解。
