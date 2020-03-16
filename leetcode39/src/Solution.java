import java.util.*;

public class Solution {
    static HashSet<List<Integer>> listHashSet = new HashSet<>();

    public static void main(String args[]) {
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);

        backtracking(listHashSet,list,candidates,target,0,0);
        List<List<Integer>> listRes = new ArrayList<>();

        Iterator it = listHashSet.iterator();

        while(it.hasNext()){
            listRes.add((List<Integer>) it.next());
        }
        list.clear();
        listHashSet.clear();

        System.out.println("");
    }

    public static void backtracking(HashSet listHashSet, ArrayList lst,int[] candidates, int target, int sum, int idx){
        if(sum > target)
            return ;

        for(int i = idx;i<candidates.length;i++){
            sum = sum + candidates[i];
            lst.add(candidates[i]);

            if(sum == target){
                ArrayList<Integer> listOfRes = new ArrayList<>();
                Iterator it = lst.iterator();

                while(it.hasNext()){
                    listOfRes.add((Integer) it.next());
                }
                listHashSet.add(listOfRes);
                lst.remove(lst.size()-1);
                return;
            }
            backtracking(listHashSet,lst,candidates,target,sum,i);
            lst.remove(lst.size()-1);
            sum = sum - candidates[i];
        }
    }
}
