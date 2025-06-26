class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] s = new String[strs.length];
        for(int i = 0;i < strs.length;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            s[i] = new String(ch);
        }        
        HashSet<String> hs = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0;i < s.length;i++){
            if(!hs.contains(s[i])){
                List<String> group = new ArrayList<>();
                for(int j = i;j < s.length;j++){
                    if(s[j].equals(s[i]))
                        group.add(strs[j]);
                }
                res.add(group);
                hs.add(s[i]);
            }
        }
        return res;
    }
}