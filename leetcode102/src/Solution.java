import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> lists = new ArrayList<>();

        levelOrder(root,lists,1);

        System.out.println("");
    }

    public static void levelOrder(TreeNode root, List<List<Integer>> lists,int level) {
        if(root == null) {
            return;
        }

        if(lists.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(root.val);
            lists.add(tempList);
        }
        else if(lists.size() < level) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(root.val);
            lists.add(tempList);
        }
        else {
            lists.get(level-1).add(root.val);
        }
        levelOrder(root.left, lists, level+1);
        levelOrder(root.right, lists, level+1);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
}