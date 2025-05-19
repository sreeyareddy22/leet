class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0],b = nums[1],c = nums[2];
        if(a+b <= c || b+c <= a || a+c <= b )
            return "none";
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums)
            hs.add(i);
        if(hs.size() == 1)
            return "equilateral";
        return hs.size() == 2 ? "isosceles" : "scalene";
    }
}