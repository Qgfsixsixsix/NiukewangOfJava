public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length() == 0)
            return str;
        String st1 = str.substring(0, n);
        String st2 = str.substring(n, str.length());
        return st2 + st1;
    }
}

Title:
//例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！

Algorithm analysis:
//把字符串的前n位截出来，然后把剩余的和截出来相加
//也可以用StringBuffer

//eg:

StringBuffer sb = new StringBuffer(str.substring(0, n));
StringBuffer sb1 = new StringBuffer(str.substring(n, str.length()));
sb1.append(sb);//加入后放在后面
return sb1.toString();
