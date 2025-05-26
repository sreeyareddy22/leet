class Solution {
    public int minBitFlips(int x, int y) {
        int ans = 0;
        for(int i = 0;i < 32;i++){
            ans += (x&1)^(y&1);
            x = x >> 1;
            y = y >> 1;
        }
    return ans;
    }
}