import java.util.Arrays;

public class Solution {
    public static void main(String args[]){
        int[] A = new int[] {-4,-1,0,3,10};

        for(int i = 0;i<A.length;i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);

        for(int data : A){
            System.out.println(data + " ");
        }
    }
}
