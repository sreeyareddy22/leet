class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int cnt1[] = new int[26];
        int cnt2[] = new int[26];
        for(int i = 0;i < ransomNote.length();i++)
            cnt1[ransomNote.charAt(i)-'a']++;
        for(int i = 0;i < magazine.length();i++)
            cnt2[magazine.charAt(i)-'a']++;
        for(int i = 0;i < 26;i++){
            if(cnt1[i] != 0){
                if(cnt1[i] > cnt2[i])
                    return false;
            }
        }
        return true;
    }
}