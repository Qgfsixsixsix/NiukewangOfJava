import java.util.Arrays;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        int numZero = 0;
        int num_sum = 0;
        if(numbers.length == 0)
            return false;
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] == 0){
                numZero++;
                continue;
            }
            if(numbers[i] == numbers[i + 1])
                return false;
            num_sum += numbers[i + 1] - numbers[i] - 1;
        }
        if(numZero >= num_sum)
            return true;
        return false;
    }
}

Title:
//随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿
//王牌可以表示任意的牌，如果牌能组成顺子就输出true，否则就输出false

Algorithm analysis:
//1、排序 
//2、计算所有相邻数字间隔总数 
//3、计算0的个数 
//4、如果2、3相等，就是顺子 
//5、如果出现对子，则不是顺子
