public class Solution {
    public static void main(String args[]){
        int x = 1, y = 4;

        String x_str = Integer.toBinaryString(x);
        String y_str = Integer.toBinaryString(y);

        int res = 0;

        if(x_str.length() > y_str.length()){
            int len = x_str.length() - y_str.length();
            for(int i = 0; i<len;i++){
                y_str = "0"+y_str;
            }
            for(int i = 0;i<x_str.length();i++){
                if(x_str.charAt(i) != y_str.charAt(i))
                    res ++;
            }
        }
        else {
            int len = y_str.length() - x_str.length();
            for(int i = 0; i<len;i++){
                x_str = "0" + x_str;
            }
            for(int i = 0;i<y_str.length();i++){
                if(x_str.charAt(i) != y_str.charAt(i))
                    res ++;
            }
        }

        System.out.println(res);
    }
}


/*
0ms 솔루션
class Solution {
    public int hammingDistance(int x, int y) {

        int z=x^y;
        int count=0;

        while(z>0)
        {
            count+= z&1;
            z>>=1;
        }

        return count;
    }
}
 */