## title
## 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
## 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
## 如果当前字符流没有存在出现一次的字符，返回#字符。

import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    //create a HashMap to storage a char and a count that add up the times when a char appears in a string
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    //create a ArrayList to storage a char in squence
    ArrayList<Character> list = new ArrayList<Character>();
    
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch) + 1);
        }
        else{
            map.put(ch, 1);
        }
        list.add(ch);
    }
    
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char flag = '#';
        for(char ch : list){
            if(map.get(ch) == 1){
                flag = ch;
                break;
            }
        }
        return flag;
    }
}

## 算法思路很简单，就不在这里说了
## 哈哈
