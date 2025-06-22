class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        int cnt = 1, maxi = 0;
        for(int n : hs){
            int num = n;
            if(!hs.contains(num-1)){
                cnt = 1;
                while(hs.contains(num+1)){
                    num++;
                    cnt++;
                }
                maxi = Math.max(cnt,maxi);
            }
        }
        return maxi;
    }
}