import java.util.Arrays;

public class Solution {
    public static void main(String args[]){
        int [] nums = new int[] {1,4,2,3};

        int sum = 0;
        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i+=2){
            sum+=nums[i];
        }

        System.out.println(sum);
    }
}
