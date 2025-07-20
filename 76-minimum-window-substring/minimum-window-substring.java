class Solution {
    public String minWindow(String s, String t) {
        if(s.equals(t))
            return t;
        if(s.length() < t.length())
            return "";
        int cnt1[] = new int[58];
        for(int i = 0;i < t.length();i++){
            char c = t.charAt(i);
            cnt1[c-'A']++;
        }

        int i = 0, j = 0;
        String res = s;
        boolean flag = false;
        int cnt2[] = new int[58];
        for(j = 0;j < s.length();j++){
            char ch = s.charAt(j);
            cnt2[ch-'A']++;
            while(sContainsT(cnt1,cnt2)){
                flag = true;
                res = res.length() < j-i+1 ? res : s.substring(i,j+1);
                cnt2[s.charAt(i) - 'A']--;
                i++;
            }
        }
        return flag ? res : "";
    }
    static boolean sContainsT(int cnt1[], int cnt2[]){
        for(int i = 0;i < 58;i++){
            if(cnt1[i] != 0){
                if(cnt2[i] < cnt1[i])
                    return false;
            }
        }
        return true;
    }
}