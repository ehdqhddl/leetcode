public class Solution {
    public static void main(String args[]){
        int x = 4, y = 2;

        String x_str = Integer.toString(x,2);
        String y_str = Integer.toString(y,2);

        int max = Integer.max(x_str.length(), y_str.length());
        int res = 1;
        String formats = "%0" + Integer.toString(max) + "d";

        x_str = String.format(formats,Integer.parseInt(Integer.toBinaryString(x).toString()));
        y_str = String.format(formats,Integer.parseInt(Integer.toBinaryString(y).toString()));

        int[] x_bits = new int[max];
        int[] y_bits = new int[max];

        for(int i = 0;i<x_str.length();i++){
            x_bits[i] = x_str.charAt(i)-48;
        }
        for(int i = 0;i<y_str.length();i++){
            y_bits[i] = y_str.charAt(i)-48;
        }

        for(int i = 0 ;i<max;i++){
            if(x_bits[i]!=y_bits[i] && i!=0){
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
}
