import java.util.Hashtable;

public class Solution {
    public static void main(String agrs[]){
        int[] nums = new int[] {4,1,2,1,2};
        int res = 0;

        Hashtable<Integer,Integer> ht = new Hashtable<>();

        for(int i : nums){
            ht.put(i,ht.getOrDefault(i,0)+1);
        }

        for(int i : ht.keySet()){
            if(ht.get(i)==1){
                res =  i;
                break;
            }
        }

        System.out.println(res);
    }
}
