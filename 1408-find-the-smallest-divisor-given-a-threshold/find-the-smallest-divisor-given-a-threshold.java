class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi = 0;
        for(int i = 0;i < nums.length;i++){
            maxi = Math.max(maxi,nums[i]);
        }
        int low = 0,high = maxi;
        while(low <= high){
            int mid = (low+high)/2;
            boolean flag = isPoss(nums,threshold,mid);
            if(flag)    
                high = mid-1;
            else
                low = mid+1;
        }
    return low;
    }
    static boolean isPoss(int[] nums,int t,int x){
        long tSum = 0;
        for(int i = 0;i < nums.length;i++){
            tSum += Math.ceil((double)nums[i]/x);
        }
        if(tSum <= t)
            return true;
    return false;
    }
}