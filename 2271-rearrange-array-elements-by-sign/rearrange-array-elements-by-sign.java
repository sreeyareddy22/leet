class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pi = 0;
        int ni = 1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0){
                res[pi] = nums[i];
                pi += 2;
            }
            if(nums[i] < 0){
                res[ni] = nums[i];
                ni += 2;
            }
        }
    return res;
    }
}