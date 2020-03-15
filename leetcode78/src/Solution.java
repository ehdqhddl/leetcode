import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Solution {
    static HashSet<ArrayList<Integer>> hs = new HashSet<>();
    static ArrayList<Integer> lst = new ArrayList<>();

    public static void main(String args[]){

        int[] nums = new int[] {1,2,3};
        boolean[] visit = new boolean[nums.length];
        List<List<Integer>> lstRes = new ArrayList<>();

        backtracking(hs,lst,nums,0);

        Iterator it = hs.iterator();
        while(it.hasNext()) {
            lstRes.add((ArrayList<Integer>) it.next());
        }
        hs.clear();
        lst.clear();

        lstRes.add(lst);
    }

    public static void backtracking(HashSet hs, ArrayList lst, int[] nums, int cnt){
        ArrayList<Integer> lstClone;
        if(cnt == nums.length)
            return ;
        for(int i = cnt;i<nums.length;i++){
            lst.add(nums[i]);
            lstClone = (ArrayList)lst.clone();
            hs.add(lstClone);
            backtracking(hs,lst,nums,i+1);
            lst.remove(lst.size()-1);
        }
    }
}
