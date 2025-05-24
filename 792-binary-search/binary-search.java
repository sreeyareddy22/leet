class Solution {
    public int search(int[] nums, int target) {
        int x = binSearch(nums,target,0,nums.length-1);
        return x;
    }
    static int binSearch(int[] arr, int x, int l, int h){
        if(l <= h){
            int mid =  (l+h)/2;
            if(arr[mid] < x)
                return binSearch(arr,x,mid+1,h);
            else if(arr[mid] > x)
                return binSearch(arr,x,l,mid-1);
            else
                return mid;
        }
    return -1;
    }
}