## title
## 统计一个数字在排序数组中出现的次数

## the first solution 
## 简单粗暴，直接来个for循环，统计出现的次数
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        if(array == null || array.length == 0) return 0;
        if(k < array[0] || k > array[array.length - 1]) return 0;
        for(int i = 0; i < array.length; i++){
            if(k == array[i]) count++;
        }
        return count;
    }
}

## the second solution
## 出现有序的数组一般都是用二分查找法
public class Solution {
    /**
    * 采用二分查找方法
    * 利用递归查找与k数字开头相等的下标
    * 利用循环查找与k数字结尾相等的下标
    */
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0) return 0;
        if(array[0] > k || array[array.length - 1] < k) return 0;
        
        //查找与k相等的开头下标
        int start_index = getStartIndex(array, k, 0, array.length);
        
        //查找与k相等的结尾下标
        int end_index = getEndIndex(array, k, 0, array.length);
        if(start_index != -1 && end_index != -1){
            return end_index - start_index + 1;
        }
        return 0;
    }
    
    //利用递归查找开头下标
    public int getStartIndex(int [] array, int k, int start, int end){
        if(start > end) return -1;
        int mid = (start + end) >> 1;
        if(array[mid] > k) return getStartIndex(array, k, start, mid - 1);
        else if(array[mid] < k) return getStartIndex(array, k, mid + 1, end);
        else if(mid - 1 >= 0 && array[mid - 1] == k) return getStartIndex(array, k, start, mid - 1);
        else return mid;
    }
    
    //利用循环查找结尾下标
    public int getEndIndex(int [] array, int k, int start, int end){
        int mid = (start + end) >> 1;
        while(start <= end){
            if(array[mid] > k) 
                end = mid - 1;
            else if(array[mid] < k)
                start = mid + 1;
            else if(mid + 1 < array.length && array[mid + 1] == k)
                start = mid + 1;
            else 
                return mid;
            mid = (start + end) >> 1;
        }
        return -1;
    }
}
