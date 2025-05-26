class Solution {
    static boolean idxHasKmissIntegers(int[] arr,int k,int mid){
        int noOfMissingInt = arr[mid]-mid-1;
        if(noOfMissingInt >= k)
            return true;
        return false;
    }
    public int findKthPositive(int[] arr, int k) {
        int maxi = 0;
        for(int i = 0;i < arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int low = 0,high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            boolean flag = idxHasKmissIntegers(arr,k,mid);
            if(flag)
                high = mid-1;
            else
                low = mid+1;
        }
    return low+k;
    }
}