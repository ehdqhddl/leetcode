import java.text.Format;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String args[]){
        String S = "loveleetcode";
        int short_idx = 0;
        int[] arr_res = new int[S.length()];
        char C = 'e';

        Queue<Integer> que = new LinkedList<Integer>();

        for(int i = 0;i<S.length();i++){
            if(S.charAt(i)==C)
                que.add(i);
        }

        short_idx = que.poll();

        for(int i = 0;i< S.length();i++){
            if(i==short_idx){
                arr_res[i] = 0;
                continue;
            }

            if(!que.isEmpty()){
                if (Math.abs(i - short_idx) >= Math.abs(i - que.peek())) {
                    short_idx = que.poll();
                }
                arr_res[i] = Math.abs(i-short_idx);
            }
            else{
                arr_res[i] = Math.abs(i-short_idx);
            }
        }

        for(int idx : arr_res){
            System.out.print(idx + " ");
        }

    }

}
