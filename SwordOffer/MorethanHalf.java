public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        int num = array[0];
        int count = 1;
        if(len == 0)
            return 0;
        for(int i = 1; i < len; i++){
            if(array[i] == num)
                count++;
            else
                count--;
            if(count == 0){
                num = array[i];
                count = 1;
            }
        }
        count = 0;
        for(int j = 0; j < len; j++){
            if(array[j] == num)
                count++;
        }
        if(2*count > len)
            return num;
        return 0;
    }
}


title:A number that occurs more than half the time in an array 

Algorithm analysis:
//whenever a new number occurs ,"count' minus one. And wheneven a old number occurs ,"count" will add one.
//So if "count" become zero,and "num" become its number ,in addition,there are no number that 
//occurs more than half the time in an array,but if "count" is still positive number finally,it will be 
//a number that occurs more than half the time in an array.
