class Solution {
    public int rob(int[] nums) {
        int sum = 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        dp[2] = Math.max(dp[1],nums[2] + dp[0]);
        for(int i = 3;i < nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        int res = 0;
        for(int i : dp)
            res = Math.max(res,i);
        return res;
    }
}