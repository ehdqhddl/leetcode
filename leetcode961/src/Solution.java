import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Solution {
    public static void main(String args[]){
        int[] A = new int[] {5,1,5,2,5,3,5,4};
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int res = 0;
        
        for(int i = 0;i<A.length;i++){
            if(hm.get(A[i])!= null){
                int cnt = 0;
                cnt = hm.get(A[i]);
                cnt++;
                hm.put(A[i],cnt);
            }
            else{
                hm.put(A[i],1);
            }
        }

        for(Integer hms : hm.keySet()){
            if(hm.get(hms) == A.length/2){
                System.out.println(hms);
                break;
            }
        }

    }
}
