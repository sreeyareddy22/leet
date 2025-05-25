class Solution {
    static boolean isPoss(int arr[], int t, int x){
        int tWeight = 0, cnt = 0;
        for(int i = 0;i < arr.length;i++){
            tWeight += arr[i];
            if(tWeight == x){
                cnt++;
                tWeight = 0;
            }
            else if(tWeight > x){
                cnt++;
                tWeight = arr[i];
            }
        }
        if(tWeight > 0)
            cnt++;
        if(cnt <= t)    
            return true;
    return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi = 0,sum = 0;
        for(int i = 0;i < weights.length;i++){
            maxi = Math.max(maxi,weights[i]);
            sum += weights[i];
        }
        int low = maxi,high = sum;
        while(low <= high){
            int mid = (low+high)/2;
            boolean flag = isPoss(weights,days,mid);
            if(flag)    
                high = mid-1;
            else
                low = mid+1;
        }
    return low;
    }
}