public class Solution {

//      Definition for a binary tree node.
//      public class TreeNode {
//          int val;
//          TreeNode left;
//          TreeNode right;
//          TreeNode(int x) { val = x; }
//      }

    public int maxDepth(TreeNode root) {
        return findDepth(0,root);
    }

    public int findDepth(int depth, TreeNode root){
        if(root == null){
            return depth;
        }

        int left_res,right_res;

        left_res = findDepth(depth+1,root.left);
        right_res = findDepth(depth+1,root.right);

        return Math.max(left_res,right_res);
    }
}
