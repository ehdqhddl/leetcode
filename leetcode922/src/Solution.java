public class Solution {
    public static void main(String args[]){
        int[] A = new int [] {4,2,5,7};

        int[] arr_res = new int[A.length];

        int idx_odd = 1;
        int idx_even = 0;

        for(int data : A){
            if(data % 2 == 0){
                arr_res[idx_even] = data;
                idx_even += 2;
            }
            else{
                arr_res[idx_odd] = data;
                idx_odd += 2;
            }
        }

        System.out.println("");
    }
}
