class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], maxi = nums[0];
        for(int i = 1;i < nums.length;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            maxi = Math.max(maxi,sum);
        }
        return maxi;
    }
}