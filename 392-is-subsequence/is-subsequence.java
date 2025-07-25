class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        int i = 0,j = 0;
        while(j < t.length() && i < s.length()){
            if(t.charAt(j) == s.charAt(i))
                i++;
            j++;
        }
        if(i == s.length())   return true;
    return false;
    }
}