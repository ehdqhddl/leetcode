import java.util.HashSet;

public class Solution {
    static HashSet<String> st = new HashSet<>();
    public static void main(String args[]) {
        String tiles = "AAABBC";
        String subStr = "";

        boolean[] visit = new boolean[tiles.length()];

        st.clear();

        backtracking(subStr,tiles,visit,0);

        System.out.println(st.size());
    }

    public static void backtracking(String subStr,String tiles, boolean[] visit,int cnt){
        if(cnt == tiles.length())
            return ;
        for(int i = 0;i<tiles.length();i++){
            if(visit[i] == false){
                visit[i] = true;
                subStr += tiles.charAt(i);
                st.add(subStr);
                backtracking(subStr,tiles,visit,cnt+1);
                visit[i] = false;
                subStr = subStr.substring(0,cnt);
            }
        }

        return ;
    }

}
