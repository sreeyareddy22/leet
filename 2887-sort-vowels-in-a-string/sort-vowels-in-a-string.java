class Solution {
    public String sortVowels(String s) {
        String vow = "";
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(vowels.indexOf(c) != -1){
                sb.append(c);
            }
        }
        char[] sor = sb.toString().toCharArray();
        Arrays.sort(sor);
        int i = 0,k = 0;
        for(char c : ch){
            if(vowels.indexOf(c) != -1){
                ch[i] = sor[k++];
            }
            i++;
        }
        return new String(ch);
    }
}