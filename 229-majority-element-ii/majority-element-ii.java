class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0,c2 = 0;
        int n = nums.length;
        Integer can1 = null, can2 = null;
        for(int i = 0;i < n;i++){
            if(can1 != null && nums[i] == can1)
                c1++;
            else if(can2 != null && nums[i] == can2)
                c2++;
            else if(c1 == 0){
                can1 = nums[i];
                c1++;
            }
            else if(c2 == 0){
                can2 = nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i : nums){
            if(i == can1)   
                c1++;
            else if(i == can2){
                c2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        if(c1 > n/3)
            res.add(can1);
        if(c2 > n/3)
            res.add(can2);
    return res;
    }
}