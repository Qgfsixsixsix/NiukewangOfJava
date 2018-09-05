public class Solution {
    public int JumpFloor(int target) {
        if(target <= 0)
            return 0;
        else if(target == 1)
            return 1;
        else{
            int preNum = 1;
            int prePreNum = 1;
            int result = 0;
            for(int i = 2; i <= target; i++){
                result = preNum + prePreNum;
                prePreNum = preNum;
                preNum = result;
            }
            return result;
        }
    }
}
