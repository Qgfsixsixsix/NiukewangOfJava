题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode ln = queue.poll();
            if(ln.left != null) 
                queue.offer(ln.left);
            if(ln.right != null) 
                queue.offer(ln.right);
            list.add(ln.val);
        }
        return list;
    }
}
