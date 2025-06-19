class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i = 0;i < n;i++ ){
            for(int j = i+1;j < n+1;j++){
                String str = s.substring(i,j);
                if(isPalin(str)){
                    cnt++;
                }
            }
        }
    return cnt;
    }

    static boolean isPalin(String s){
        int n = s.length();
        int i = 0,j = n-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
    return true;
    }
}