import java.util.*;

public class Solution {
    public static void main(String agrs[]){
        int[] nums = new int[] {-1, 0, 1, 2, -1, -4};

        Set<String> set_str = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        int[] arr_temp = new int[]{nums[i],nums[j],nums[k]};
                        Arrays.sort(arr_temp);
                        String str_temp = arr_temp[0] + "/" + arr_temp[1] + "/" + arr_temp[2];
                        set_str.add(str_temp);
                    }
                }
            }
        }

        Iterator it = set_str.iterator();

        List<List<Integer>> lst_res = new ArrayList<>();

        while(it.hasNext()){
            List<Integer> lst_temp = new ArrayList<>();
            for(String s:it.next().toString().split("/")){
                lst_temp.add(Integer.parseInt(s));
            }
            lst_res.add(lst_temp);
        }

        System.out.print("");
    }
}
