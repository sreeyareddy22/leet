class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = binSearch(nums,target,true);
        int right = binSearch(nums,target,false);
        res[0] = left;
        res[1] = right;
        return res;
    }
    static int binSearch(int[] nums,int x,boolean isSearchLeft){
        int l = 0,h = nums.length-1;
        int res = -1;
        while(l <= h){
            int mid = (l+h)/2;
            if(nums[mid] < x)
                l = mid+1;
            else if(nums[mid] > x)
                h = mid-1;
            else{
                if(isSearchLeft){
                    res = mid;
                    h = mid-1;
                }
                else{
                    res = mid;
                    l = mid+1;
                }
            }
        }
    return res;
    }
}