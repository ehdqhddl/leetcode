import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String args[]){
        int left = 1, right = 22;
        ArrayList<Integer> li = new ArrayList<Integer>();

        for(int i = left;i<=right;i++){
            String temp_num = Integer.toString(i);
            int chk_length = 0;
            for(int j = 0;j<temp_num.length();j++){
                if(temp_num.charAt(j) != '0' && (i % (temp_num.charAt(j)-48)) == 0){
                    chk_length++;
                }
                else{
                    break;
                }
            }
            if (chk_length == temp_num.length()){
                li.add(Integer.parseInt(temp_num));
            }
        }
        for (Integer i : li){
            System.out.println(i);
        }
    }
}
