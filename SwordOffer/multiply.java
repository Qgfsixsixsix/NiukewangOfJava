import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int temp = 1;
        int [] B = new int[A.length];
        B[0] = 1;
        if(A.length == 0)
            return null;
        for(int i = 1; i < A.length; i++){
            B[i] = B[i-1] * A[i - 1];
        }
        for(int j = A.length - 2; j >= 0; j--){
            temp = temp * A[j + 1];
            B[j] = B[j] * temp;
        }
        return B;
    }
}

Title:
//给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
//其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
//就是除了A[i]以外的数


Algorithm analysis:
//这是的算法地址
//https://uploadfiles.nowcoder.net/images/20160829/841505_1472459965615_8640A8F86FB2AB3117629E2456D8C652
