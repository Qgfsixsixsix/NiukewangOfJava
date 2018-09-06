public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 0)
            return 0;
        else if(target == 1)
            return 1;
        else{
            int preNum = 1;
            int result = 0;
            for(int i = 2; i <= target; i++){
                result = 2*preNum;
                preNum = result;
            }
            return result;
        }
    }
}

title: A frog can step one level...n levels

eg:
step  ：1   2    3     4      5    6
amount：1   2    4     8     16   32 
