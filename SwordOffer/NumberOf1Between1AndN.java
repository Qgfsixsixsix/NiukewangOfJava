public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int high;
        int tmp,curr,low;
        int total = 0;
        int i = 1;
        high = n;
        if(n <= 0)
            return 0;
        while(high != 0){
            high = n/(int)Math.pow(10,i);
            tmp = n % (int)Math.pow(10,i);
            curr = tmp / (int)Math.pow(10,i-1);
            low = tmp % (int)Math.pow(10,i-1);
            if(curr == 1)
                total += (high) * (int)Math.pow(10,i-1) + low + 1;
            else if(curr < 1)
                total += high * (int)Math.pow(10,i-1);
            else
                total += (high + 1)* (int)Math.pow(10,i-1);
            i++;
        }
        return total;
    }
}

