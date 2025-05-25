class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = 1, mini = Integer.MAX_VALUE;
        for(int i = 0;i < piles.length;i++){
            maxi = Math.max(piles[i],maxi);
        }
        int low = 1,high = maxi;
        while(low <= high){
            int mid = (low+high)/2;
            boolean flag = isSuff(piles,h,mid);
            if(flag){
                high = mid-1;
            }
            else
                low = mid+1;
        }
    return low;
    }
    static boolean isSuff(int[] nums,int h,int k){
        long tHours = 0;
        for(int i = 0;i < nums.length;i++){
            tHours += Math.ceil((double)nums[i]/k);
        }
        if(tHours <= h)
            return true;
    return false;
    }
}