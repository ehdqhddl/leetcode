public class Solution {
    public static void main(String args[]){
        int num = 5;
        int[] arrRes = new int[num+1];

        if(num == 0){
            arrRes[0] = 0;
        }
        else if(num == 1){
            arrRes[0] = 0;
            arrRes[1] = 1;
        }
        else{
            arrRes[0] = 0;
            arrRes[1] = 1;

            for(int i = 2;i<=num;i++){
                arrRes[i] = arrRes[i/2] + i%2;
            }
        }
    }
}
