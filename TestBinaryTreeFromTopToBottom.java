import java.util.ArrayList;

/**
 * @Author：zhaowang1
 * @Description: Date: Created in 17:03 2019/5/5
 */
public class TestBinaryTreeFromTopToBottom {
    class TreeNode{
        int val = 0;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public ArrayList<Integer> printFromTopToBottom(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        if(root == null) return null;
        queue.add(root);
        while(queue.size() != 0){
            TreeNode temp = queue.remove(0);
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
            list.add(temp.val);
        }
        return list;
    }
}
