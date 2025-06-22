class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        while(n%k != 0){
            s += fill;
            n = s.length();
        }
        int idx = 0;
        String[] res = new String[n/k];
        for(int i = 0; i < n;i += k){
            res[idx] = s.substring(i,i+k);
            idx++;
        }
    return res;
    }
}