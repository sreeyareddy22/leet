class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int i =1;
        for(int j = 1;j < nums.length;j++){
            if(nums[j] != nums[i-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        int cnt = 1;
        int maxi = 1;
        for( int k = 1;k < i;k++){
            if((nums[k]-nums[k-1]) == 1){
                cnt++;
                if(maxi < cnt)
                    maxi = cnt;
            }
            else
                cnt = 1;
        }
    return maxi;
    }
}