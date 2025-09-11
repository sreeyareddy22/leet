class Solution {
    public String sortVowels(String s) {
        String vow = "";
        ArrayList<Character> al = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                al.add(ch);
            }
        }
        Collections.sort(al);
        int i = 0;
        String res = "";
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                res += al.get(i);
                i++;
            }
            else
                res += ch;
        }
        return res;
    }
}