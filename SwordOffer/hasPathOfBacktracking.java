public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix.length <= 0 || rows <= 0 || cols <= 0 || str.length <= 0)
            return false;
        int [] index = {0};
        boolean [] bl = new boolean[rows * cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(ispath(matrix, rows, cols, i, j, str, bl, index))
                    return true;
            }
        }
        return false;
    }
    public boolean ispath(char[] matrix, int rows, int cols, int row, int col, char[] str, boolean[] bl, int[] index){
        boolean flag = false;
        if(str.length == index[0])
            return true;
        if(row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[index[0]] && !bl[row * cols + col]){
            bl[row * cols + col] = true;
            index[0]++;
            flag = ispath(matrix, rows, cols, row, col - 1, str, bl, index) ||
                   ispath(matrix, rows, cols, row, col + 1, str, bl, index) ||
                   ispath(matrix, rows, cols, row - 1, col, str, bl, index) ||
                   ispath(matrix, rows, cols, row + 1, col, str, bl, index);
            if(!flag){
                index[0]--;
                bl[row * cols + col] = false;
            }
        }
        return flag;
    }
}


Title:
//请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
//路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
//如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 例如 a b c e s f c s a d e e 
//这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
//因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子

Algorithm analysis:
//典型的回溯法例子，利用递归的意义直接往上下左右查找，可以根据代码理解回溯法
