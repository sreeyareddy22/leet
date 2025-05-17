class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int pi = 0,ni = 0;
        int i = 0;
        while(pi < n && ni < n){
            while(nums[pi] < 0)
                pi++;
            while(nums[ni] > 0)
                ni++;
            res[i] = nums[pi];
            res[i+1] = nums[ni];
            i += 2;
            pi++;ni++;
        }
    return res;
    }
}