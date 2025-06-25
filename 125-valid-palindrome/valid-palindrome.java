class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                str = str + Character.toLowerCase(ch);
            if(Character.isDigit(ch))
                str = str + ch;
        }
        boolean flag = isPalin(str);
        return flag;
    }
    static boolean isPalin(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return s.equals(rev);
    }
}