class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int pos[] = new int[len/2];
        int neg[] = new int[len/2];
        int pi = 0,ni = 0;
        for(int i = 0;i < len;i++){
            if(nums[i] > 0){
                pos[pi] = nums[i];
                pi++;
            }
            else{
                neg[ni] = nums[i];
                ni++;
            }
        }
        for(int i = 0;i < len;i++){
            if(i%2 == 0){
                nums[i] = pos[i/2];
            }
            else
                nums[i] = neg[i/2];
        }
    return nums;
    }
}