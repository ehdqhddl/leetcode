import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Solution {
    public static void main(String args[]){
        String S = "IDID";

        Integer[] arr_n = new Integer[S.length()+1];
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr_res = new int[S.length()+1];

        for(int i = 0;i<arr_n.length;i++){
            arr_n[i] = i;
        }

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                Arrays.sort(arr_n);

            }
            else{
                Arrays.sort(arr_n,Collections.reverseOrder());
            }
            al.add(arr_n[0]);
            arr_n = Arrays.copyOfRange(arr_n,1,arr_n.length);
        }
        al.add(arr_n[0]);
        Iterator<Integer> it = al.iterator();
        int j = 0;
        while(it.hasNext()){
            arr_res[j] = it.next();
            j++;
        }
        System.out.print("");

    }
}


/*

1ms solution.

class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] res = new int[n+1];

        int i=0, s=0, e=n;
        for(char c: S.toCharArray()){
            if('I' == c){
                res[i++] = s++;
            }else{
                res[i++] = e--;
            }
        }
        res[i] =s;
        return res;
    }
}
 */