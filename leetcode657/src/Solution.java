public class Solution {
    public static void main(String args[]){
        String moves = "LL";
        int[] xy = new int[2]; // index 0: UP,DOWN index 1: LEFT,RIGHT

        for(int i = 0;i<moves.length();i++){
            char move = moves.charAt(i);
            if(move == 'U'){
                xy[0] ++;
            }
            else if(move == 'D'){
                xy[0] --;
            }
            else if(move == 'R'){
                xy[1] ++;
            }
            else{
                xy[1] --;
            }
        }

        if(xy[0] == 0 && xy[1] == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
