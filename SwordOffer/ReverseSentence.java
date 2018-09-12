public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals(""))
            return str;
        String [] string =str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = string.length - 1; i >= 0; i--){
            sb.append(string[i]);
            if(i >= 1)
                sb.append(" ");
        }
        return sb.toString();
    }
}

Title:
//把“student. a am I”变成“I am a student.”也就是翻转句子。

Algorithm analysis:
//先把一大串字符通过split()函数变成数组放进StringBuffer里面
//然后return sb.toString(),注意StringBuffer不可以直接return sb;
//但是String可以
