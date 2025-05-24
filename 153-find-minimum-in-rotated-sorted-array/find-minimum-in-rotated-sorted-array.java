class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length-1;
        int res = Integer.MAX_VALUE;
        while(l <= h){
            int mid = (l+h)/2;
            if(nums[mid] >= nums[h]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
            res = Math.min(res,nums[mid]);
        }
    return res;
    }
}