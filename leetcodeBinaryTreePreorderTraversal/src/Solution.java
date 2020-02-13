import java.util.ArrayList;
import java.util.List;



class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> traversal(TreeNode node, List<Integer> lst){
        if(node == null){
            return lst;
        }
        else{
            lst.add(node.val);
            lst = traversal(node.left,lst);
            lst = traversal(node.right,lst);
            return lst;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();

        return traversal(root,lst);
    }
}