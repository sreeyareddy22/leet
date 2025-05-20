class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i < n;i++){
            int key = nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            int val = e.getValue();
            if(val > n/3)
                res.add(e.getKey());
        }
    return res;
    }
}