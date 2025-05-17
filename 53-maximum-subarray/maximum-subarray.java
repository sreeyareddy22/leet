class Solution {
    //kadane alogorithm - subarray with largest sum.
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 0;i < nums.length;i++){
            maxi = Math.max(maxi,nums[i]);
            if(nums[i] >= 0){
                flag = true;
            }
        }
        int maxSum = maxi;
        int sum = nums[0];
        for(int i = 1 ;i < nums.length;i++){
            if(sum < 0)
                sum = 0;
            sum += nums[i];
            if(maxSum < sum)  
                maxSum = sum;
        }
    return flag ? maxSum : maxi ;
    }
}