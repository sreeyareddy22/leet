class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0,h = nums.length - 1;
        int idx = 0;
        while(l <= h){
            int mid = (l+h)/2;
            if(nums[mid] < target){
                l = mid+1;
                idx = l;
            }
            else if(nums[mid] > target)
                h = mid-1;
            else{
                idx = mid;
                break;
            }
        }
    return idx;
    }
}