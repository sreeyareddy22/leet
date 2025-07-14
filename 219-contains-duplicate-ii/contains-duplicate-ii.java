class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        if(k == 0)
            return false;
        for(int i = 0;i < nums.length;i++){
            if(!hs.contains(nums[i])){
                if(hs.size() >= k)
                    hs.remove(nums[i-k]);
                hs.add(nums[i]);
            }
            else
                return true;
        }
        return false;
    }
}