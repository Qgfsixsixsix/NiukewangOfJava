public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int temp = -1;
        char[] arr = str.toCharArray();
        if(str.length() <= 0)
            return -1;
        for(int i = 0; i < str.length(); i++){
            int count = 1;
            for(int j = 0; j < str.length(); j++){
                if(i == j)
                    continue;
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 1){
                temp = i;
                break;
            }
        }
        return temp;
    }
}

Title:
//在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
//并返回它的位置, 如果没有则返回 -1（需要区分大小写）.

Algorithm analysis:
//我的做法比较粗糙，就是用两个for循环从第一个开始比较，如果没有相等的字母的时候
//那么就可以标记该字符串此时的下标，然后退出循环，最后就是return 下标;如果有相等的字母的时候，那么count++
//当完成内部循环时候，那么接下来外部循环，换下一个字母进行比较，程序就是这样走的。
