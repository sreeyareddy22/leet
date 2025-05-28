class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0,zc = 0,res = 0;
        while(r < nums.length){
            if(nums[r] == 0)
                zc++;
            while(zc > k){
                if(nums[l] == 0)
                    zc--;
                l++;
            }
            res = Math.max(res,r-l+1);
            r++;
        }
    return res;
    }
}