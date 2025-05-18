class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            int s = digSum(nums[i]);
            if(i == s)
                return i;
        }
    return -1;
    }
    public int digSum(int n){
        int sum = 0;
        while(n > 0){
            int d = n%10;
            sum += d;
            n = n/10;
        }
    return sum;
    }
}