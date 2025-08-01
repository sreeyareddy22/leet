class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
            return 0;
        if(nums[0] > nums[1])
            return 0;
        int n = nums.length;
        if(nums[n-1] > nums[n-2])
            return n-1;
        for(int i = 1;i < n-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
                return i;
        }
        return -1;
    }
}