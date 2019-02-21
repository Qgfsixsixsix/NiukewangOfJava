public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
// one.java
求二进制(binary system)1的个数

计算机中的负数是以其补码形式存在的 补码=原码取反+1。
先把整数原码取反

