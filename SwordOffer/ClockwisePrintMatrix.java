题目：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下4 X 4矩阵： 
1   2   3   4 
5   6   7   8 
9  10  11  12 
13 14  15  16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10. 

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1; // 获取行数 - 1
        int dC = matrix[0].length - 1; // 获取列数 - 1
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix == null) return null;
        while(tR <= dR && tC <= dC){
	    // 如果只有行，没有列
            if(tR == dR) for(int i = tC;i <= dC; i++) list.add(matrix[tR][i]);
	    // 如果只有列，没有行
            else if(tC == dC) for(int i = tR; i <= dR; i++) list.add(matrix[i][tC]);
	    // 行和列都存在
            else{
                for(int i = tC; i < dC; i++) list.add(matrix[tR][i]);
                for(int j = tR; j < dR; j++) list.add(matrix[j][dC]);
                for(int k = dC; k > tC; k--) list.add(matrix[dR][k]);
                for(int h = dR; h > tR; h--) list.add(matrix[h][tC]);
            }
	    // 循环一圈，各自下标改变
            tR++; tC++; dR--; dC--;
        }
        return list;
    }
}
