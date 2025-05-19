class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cnt = 0,maxi = 0;
        int i = 0,j = 0;
        Set<Character> hs = new HashSet<>();
        while(j < s.length()){
            char ch = s.charAt(j);
            if(!hs.contains(ch)){
                hs.add(ch);
                maxi = Math.max(j-i+1,maxi);
                j++;
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
    return maxi;
    }
}