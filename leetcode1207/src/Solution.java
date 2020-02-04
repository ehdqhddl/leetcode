import java.util.HashSet;
import java.util.Hashtable;

public class Solution {
    public static void main(String args[]){
        int[] arr = new int[] {1,2,2,1,3};

        Hashtable<Integer,Integer> ht = new Hashtable<>();

        for(int i : arr){
            ht.put(i,ht.getOrDefault(i,1) + 1);
        }

        HashSet<Integer> hs = new HashSet<>(ht.values());

        if(ht.values().size() != hs.size())
            System.out.print(false);
        else{
            System.out.print(true);
        }
    }
}
