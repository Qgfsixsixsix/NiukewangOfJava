题目描述：定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数
（时间复杂度应为O（1））。

解题思路：利用一个辅助栈,当数据压栈时，这时候检查辅助栈是否有数据，没数据的话直接把数据压栈到
         辅助栈，如果有数据，记得把辅助栈的栈顶拿出来（赋予变量，然后压栈）和正常压栈的数据
         比较，大于正常数据，那么辅助栈压栈正常数据，如果小于正常数据，那么辅助栈压栈变量，
         这样就可以保证辅助栈的栈顶都是这个栈的最小值。此外，正常栈和辅助栈都是同时压栈和弹
         出。注意：压栈和弹出都要检查栈是否还存在数据

import java.util.Stack;

public class Solution {

    Stack<Integer> stack_int = new Stack<Integer>();// 这个是正常'栈的push和pop
    Stack<Integer> stack = new Stack<Integer>();// 这个是辅助栈
    // 两个栈同时压栈
    public void push(int node) {
        stack_int.push(node);
        if(stack.isEmpty()){
            stack.push(node);
        }
        else{
            int t = stack.pop();
            stack.push(t);
            if(node >= t){
                stack.push(t);
            }
            else{
                stack.push(node);
            }
        }
    }
    
    // 两个栈同时弹出，注意检查栈是否还有数据
    public void pop() {
        if(!stack_int.isEmpty()){
            stack_int.pop();
        }
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    // 获取栈顶的数值，但是不能弹出，所以再次压栈进出
    public int top() {
        int k = stack_int.pop();
        stack_int.push(k);
        return k;
    }
    
    // 获取辅助栈的栈顶数值，也就是这个栈的最小值，但不能弹出，所以再次压栈进出
    public int min() {
        int h = stack.pop();
        stack.push(h);
        return h;
    }
}
