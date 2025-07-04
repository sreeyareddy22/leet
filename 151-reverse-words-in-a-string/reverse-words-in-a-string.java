class Solution {
    public String reverseWords(String str) {
        Stack<String> st = new Stack<>();
        String s[] = str.trim().split("\\s+");
        for(String word : s){
            st.push(word);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < s.length;i++){
            ans.append(st.pop());
            if(!st.isEmpty())
                ans.append(" ");
        }
        return ans.toString();
    }
}