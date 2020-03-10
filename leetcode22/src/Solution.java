import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public static void main(String args[]){
        String str = "";
        int n = 3;
        List<String> lstRes = new ArrayList<String>();
        backtracking(lstRes,str,n,0,0);

        Iterator it = lstRes.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void backtracking(List<String> lstRes, String str, int n,int l, int r){
        if(str.length() == n*2 && l == n && r == n) {
            String res_sub = str;
            lstRes.add(res_sub);
        }
        if(l>=r) {
            if (l < 3)
                backtracking(lstRes,str + "(", n, l + 1, r);
            if (r < 3)
                backtracking(lstRes,str + ")", n, l, r + 1);
        }
    }
}
