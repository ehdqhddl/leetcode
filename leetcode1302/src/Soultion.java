/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Soultion {
    public int deepestLeavesSum(TreeNode root) {
        NodeInfo ni = new NodeInfo(0,root.val);
        ni = deepFind(0,root);

        return ni.val;
    }

    public NodeInfo deepFind(int depth, TreeNode root){
        if(root.right == null && root.left == null){
            NodeInfo res = new NodeInfo(depth,root.val);
            return res;
        }

        NodeInfo left_Node = new NodeInfo(depth,root.val);
        NodeInfo right_Node = new NodeInfo(depth,root.val);

        if(root.left != null)
            left_Node = deepFind(depth+1,root.left);
        if(root.right != null)
            right_Node = deepFind(depth+1,root.right);

        if(left_Node.depth == right_Node.depth){
            NodeInfo res = new NodeInfo(left_Node.depth,left_Node.val + right_Node.val);
            return res;
        }

        else if(left_Node.depth > right_Node.depth){
            NodeInfo res = new NodeInfo(left_Node.depth,left_Node.val);
            return res;
        }
        else{
            NodeInfo res = new NodeInfo(right_Node.depth,right_Node.val);
            return res;
        }
    }
}

class NodeInfo {
    int depth;
    int val;
    NodeInfo(int depth, int val){
        this.depth = depth;
        this.val = val;
    }
}