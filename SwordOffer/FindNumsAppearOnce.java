//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length <= 0){
            num1[0] = num2[0] = 0;
            return;
        }
        for(int i = 0; i < array.length; i++){
            int count = 1;
            for(int j = 0; j < array.length; j++){
                if(i == j)
                    continue;
                if(array[i] == array[j])
                    count++;
            }
            if(count ==1){
                num1[0] = array[i];
                break;
            }
        }
        for(int k = 0; k < array.length; k++){
            int count = 1;
            if(array[k] == num1[0])
                continue;
            for(int h = 0; h < array.length; h++){
                if(k == h)
                    continue;
                if(array[k] == array[h])
                    count++;
            }
            if(count == 1){
                num2[0] = array[k];
                break;
            }
        }
    }
}

Title:
//一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。

Algorithm analysis:
//这道题类似于查找第一个只出现一次的字母，我也是用简单粗暴的方法，用两个for循环，一个查找num1[0]
//一个查找num2[0]，只不过在查找num2[0]时加了一个限定条件( if(array[k] == num1[0]) continue;)
