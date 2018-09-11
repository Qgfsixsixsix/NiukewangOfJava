import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array == null || array.length < 2)
            return list;
        int i = 0;
        int j = array.length - 1;
        while(i < j){
            if(array[i] + array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
            else if(array[i] + array[j] < sum)
                i++;
            else
                j--;
        }
        return list;
    }
}

Title:输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
//如果有多对数字的和等于S，输出两个数的乘积最小的

Algorithm analysis:
//一个从最小开始，一个从最大开始，左右“夹逼”，找到的乘积自然是最小的，然后返回就可以了
