题目描述：操作给定的二叉树，将其变换为源二叉树的镜像。

源二叉树
     8
   6   10
  5 7 9  11

镜像二叉树
     8
   10  6
 11 9 7 5

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
    public void Mirror(TreeNode root) {
        // 利用递归的思想，终止条件是 root = null
        if(root == null) return;
        TreeNode tn;
        tn = root.right;
        root.right = root.left;
        root.left = tn;
        // 右子树镜像
        Mirror(root.right);
        // 左子树镜像
        Mirror(root.left);
    }
}
