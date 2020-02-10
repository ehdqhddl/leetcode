import java.util.Arrays;

public class Solution {
    public static void main(String args[]){
        int[] heights = new int[] {1,1,4,2,1,3};

        int[] arr_sorted = Arrays.copyOf(heights,heights.length);
        int res = 0;
        Arrays.sort(arr_sorted);

        for(int i=0;i<heights.length;i++){
            if(arr_sorted[i] != heights[i]){
                res++;
            }
        }

        System.out.println(res);
    }
}
