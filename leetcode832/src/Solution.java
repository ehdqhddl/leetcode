public class Solution {
    /*
        1,1,0
        1,0,1
        0,0,0
     */

    public static void main(String args[]){
        int[][] A = new int[][] {{1,1,0},{1,0,1},{0,0,0}};

        for(int i = 0;i<A.length;i++){
            for(int j=0,k=A[i].length-1;j<A[i].length/2;j++,k--){
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
            }
        }

        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                A[i][j] = A[i][j] == 1 ? 0 : 1;
            }
        }
    }


}
