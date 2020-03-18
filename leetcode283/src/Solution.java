import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String args[]){
        int[] nums = new int[] {4,2,4,0,0,3,0,5,1,0};

        int cnt=0
                ;
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i : nums)
            lst.add(i);

        while(lst.indexOf(0) != -1){
            lst.remove(lst.indexOf(0));
            cnt++;
        }

        for(int i = 0;i<cnt;i++){
            lst.add(0);
        }

        for(int i =0;i<lst.size();i++)
            nums[i] = lst.get(i);

        System.out.println("");
    }
}
