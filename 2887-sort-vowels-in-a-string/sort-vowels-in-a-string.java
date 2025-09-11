class Solution {
    public String sortVowels(String s) {
        String vow = "";
        String vowels = "aeiouAEIOU";
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                vow += ch;
            }
        }
        char[] chars = vow.toCharArray();
        Arrays.sort(chars);
        String res= "";
        int i = 0;
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                res += chars[i];
                i++;
            }
            else
                res += ch;
        }
        return res;
    }
}