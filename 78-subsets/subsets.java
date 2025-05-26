class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < Math.pow(2,nums.length);i++){
            List<Integer> ans = new ArrayList<>();
            int temp = i;
            for(int j = 0;j < nums.length;j++){
                if((temp&1) == 1)
                    ans.add(nums[j]);
                temp = temp >> 1;
            }
            res.add(ans);
        }
    return res;
    }
}