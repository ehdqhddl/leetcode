import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String args[]){
        int[] arr = new int[6];
        arr[0] = 17;
        arr[1] = 18;
        arr[2] = 5;
        arr[3] = 4;
        arr[4] = 6;
        arr[5] = 1;

        int max_num = arr[arr.length-1];
        int before_num;
        arr[arr.length-1] = -1;

        for(int i = arr.length-2 ; i > -1 ;i--){
            before_num = arr[i];
            arr[i] = max_num;
            max_num = Math.max(before_num,max_num);
        }


        for(int i : arr){
            System.out.println(i);
        }
    }
}
