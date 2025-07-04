class Solution {
    public String reverseWords(String str) {
        Stack<String> st = new Stack<>();
        String s[] = str.trim().split("\\s+");
        for(String word : s){
            st.push(word);
        }
        String ans = "";
        for(int i = 0;i < s.length;i++){
            String p = st.pop();
            ans += p;
            if(!st.isEmpty())
                ans += " ";
        }
        return ans;
    }
}