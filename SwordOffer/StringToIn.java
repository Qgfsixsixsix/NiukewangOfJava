public class Solution {
    public int StrToInt(String str) {
        if(str.equals("") || str.length() == 0)
            return 0;
        char [] ch = str.toCharArray();
        int symbol = 0;
        int sum = 0;
        if(ch[0] == '-')
            symbol = 1;
        for(int i = symbol; i < ch.length; i++){
            if(ch[i] == '+')
                continue;
            if(ch[i] < 48 || ch[i] > 57)
                return 0;
            sum = sum * 10 + ch[i] - 48;
        }
        return symbol == 0 ? sum : sum * -1;
    }
}

Tilte:
//输入一个字符串,包括数字字母符号,可以为空,如果是合法的数值表达则返回该数字，否则返回0
//要求不能使用字符串转换整数的库函数


Algorithm analysis:
//设定一个值symbol = 0;作为前面符号的判断，这里算是一个巧妙之处，再者，判定字符串里面是否是数字
//可以用a[i] > 48 || a[i] < 57;最后就是若symbol为意味着前面是“+”，所以直接返回sum,若symbol
//为1，结果乘以-1.
