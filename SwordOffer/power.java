public class Solution {
    public double Power(double base, int exponent) {
        double result = 1;
        for(int i = 0; i < Math.abs(exponent); i++){
            result *= base;
        }
        if(exponent < 0)
            return 1/result;
        return result;
  }
}

title:Base is double type and exponent is int type,so compute power(base,exponent) 
