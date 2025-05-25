class Solution {
    static int maxi(int[] arr){
        int res = 0;
        for(int i = 0;i < arr.length;i++){
            res = Math.max(res,arr[i]);
        }
    return res;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long req = 1L*m*k;
        if(bloomDay.length < req)
            return -1;
        int low = 1,high = maxi(bloomDay);
        while(low <= high){
            int mid = (low+high)/2;
            boolean flag = isPossible(bloomDay,m,k,mid);
            if(flag)    
                high = mid-1;
            else
                low = mid+1;
        }
    return low;
    }
    static boolean isPossible(int[] nums,int m,int k,int x){
        int cnt = 0;
        int noOfBouq = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] <= x){
                cnt++;
                if(cnt == k){
                    noOfBouq++;
                    cnt = 0;
                }
            }
            else
                cnt = 0;
        }
        if(noOfBouq >= m)
            return true;
    return false;
    }
}