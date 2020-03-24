public class Solution {
    static int res;
    public static void main(String args[]){
        int[] nums = new int[]{0,0,1};
        int S=1;
        res = 0;

        dfs(nums,S,0,0);

        System.out.println(res);
    }

    public static void dfs(int[] nums, int S, int idx, int sum){
        if(idx==nums.length){
            if(sum==S)
                res++;
            return;
        }

        dfs(nums,S,idx + 1,sum + (nums[idx] * -1));
        dfs(nums,S,idx + 1,sum + (nums[idx] * 1));

        return;
    }
}
