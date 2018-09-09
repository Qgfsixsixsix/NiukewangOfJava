import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int n;
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        n = numbers.length;
        for(int i = 0; i < n; i++){
            list.add(numbers[i]);
        }
        Collections.sort(list,new Comparator<Integer>(){
            public int compare(Integer str1,Integer str2){
                String s1 = str1 + "" + str2;
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        for(int j:list){
            s += j;
        }
        return s;
    }
}

Title:import an array,which is {3,32,321},and print minimum number with these figures.eg:321323

Algorithm analysis:
//In a word,Integer becomes string and compare with every two figures,so minimun one is in the front,
//and the maximum is in the back;
