class Solution {
    public String reverseWords(String str) {
        Stack<String> st = new Stack<>();
        String s[] = str.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = s.length-1;i >= 0;i--){
            ans.append(s[i]);
            if(i != 0)
                ans.append(" ");
        }
        return ans.toString();
    }
}