class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < n-3;i++){
            if(i >0 && nums[i] == nums[i-1])
                continue;
            for(int j = i+1;j < n;j++){
                int left = j+1,right = n-1;
                if(j > i+1 && nums[j] == nums[j-1]) 
                    continue;
                while(left < right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        List<Integer> ans = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        res.add(ans);
                        while(left < n-1 && nums[left] == nums[left+1]){
                            left++;
                        }
                        while(right > n-1 && nums[right] == nums[right-1])
                            right--;
                        left++;
                        right--;
                    }
                    else if(sum > target)
                        right--;
                    else
                        left++;
                    
                } 
            }
        }
    return res;
    }
}