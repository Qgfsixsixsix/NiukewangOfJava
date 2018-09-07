import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k > input.length)
            return list;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < input.length-i-1; j++){
                if(input[j] < input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
            list.add(input[input.length-i-1]);
        }
        return list;
    }
}

title:k number in an array are minimum.

Algorithm analysis:
//Bubble sort finds the minimum number every time,which can find k minimum numbers in k time(s).
