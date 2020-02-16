import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String args[]){
        String s = "Let's take LeetCode contest";
        String[] str_splitStrings = s.split(" ");
        String str_res = "";


        for(int i = 0;i<str_splitStrings.length;i++){
            str_res += new StringBuilder(str_splitStrings[i]).reverse().toString();
            if(i!=str_splitStrings.length - 1){
                str_res += " ";
            }
        }
        System.out.println(str_res);
    }
}
