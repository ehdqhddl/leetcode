import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {
    static List<List<Integer>> lstRes = new ArrayList<>();
    static Stack<Integer> lstSub = new Stack<>();

    static void backtrack(int[] visitNums, int nums[]){
        if(lstSub.size() == nums.length){
            for(int i = 0;i<lstSub.size();i++){
                System.out.print(lstSub.get(i) + " ");
            }
            System.out.println("");
            List<Integer> clst = new ArrayList<>(lstSub);
            lstRes.add(clst);
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(visitNums[i] == 0){
                visitNums[i] = 1;
                lstSub.add(nums[i]);
                backtrack(visitNums,nums);
                visitNums[i] = 0;
                lstSub.pop();
            }
        }
    }

    public static void main(String args[]){
        int[] nums = new int[] {1,2};
        int[] visitNums = new int[nums.length];
        lstRes.clear();

        backtrack(visitNums,nums);
    }


}