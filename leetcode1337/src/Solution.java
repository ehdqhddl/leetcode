import java.util.*;

public class Solution {
    public static void main(String args[]){
        int[][] mat = new int[][] {{1,0,0,0},
                                   {1,1,1,1},
                                   {1,0,0,0},
                                   {1,0,0,0}};
        int k = 2;

        int row_sum;
        int[] arr_res = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<mat.length;i++){
            row_sum = 0;
            for(int j=0;j<mat[i].length;j++){
                row_sum += mat[i][j];
            }
            hm.put(i,row_sum);
        }

        List<Integer> keyList = new ArrayList<>(hm.keySet());

        Collections.sort(keyList, Comparator.comparing(hm::get));

        for(int i = 0;i<k;i++){
            arr_res[i] = keyList.get(i);
            System.out.println(arr_res[i]);
        }
    }
}
