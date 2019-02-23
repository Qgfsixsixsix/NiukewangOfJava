题目：输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
     另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
     （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

解题思路：
    先不管 1 2 3 的关系，分别复制他们节点放进哈希表里
    1 -> 1'
    2 -> 2'
    3 -> 3'
    4 -> 4'
    然后，
    1'.next = get(1.next)
    1'.random = get(1.random)
    
    进阶思路：
    1 -> 1' -> 2 -> 2' -> ................
    
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
import java.util.HashMap;
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        int i = 0;
        RandomListNode l = null;
        RandomListNode Head = null;
        RandomListNode tmp = pHead;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        if(pHead == null) return null;
        while(tmp != null){
            Head = new RandomListNode(tmp.label);
            if(i == 0){
                l = Head;
            }
            map.put(tmp, Head);
            tmp = tmp.next;
            i++;
        }
        Head = l;
        while(pHead != null){
            map.get(pHead).next = map.get(pHead.next);
            map.get(pHead).random = map.get(pHead.random);
            pHead = pHead.next;
        }
        return Head;
    }
}
