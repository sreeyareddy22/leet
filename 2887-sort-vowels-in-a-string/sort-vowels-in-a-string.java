class Solution {
    public String sortVowels(String s) {
        String vow = "";
        int n = s.length();
        ArrayList<Character> al = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        boolean[] b = new boolean[n];
        for(int i = 0;i < n;i++){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1){
                al.add(ch);
                b[i] = true;
            }
        }
        Collections.sort(al);
        int p = 0;
        String res = "";
        for(int i = 0;i < n;i++){
            if(b[i]){
                res += al.get(p);
                p++;
            }
            else
                res += s.charAt(i);
        }
        return res;
    }
}