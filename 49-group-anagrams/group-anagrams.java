class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            char str[] = s.toCharArray();
            Arrays.sort(str);
            String org = new String(str);
            if(!hm.containsKey(org)){
                hm.put(org,new ArrayList<>());
            }
            hm.get(org).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String,List<String>> e : hm.entrySet()){
            List<String> group = e.getValue();
            res.add(group);
        }
        return res;
    }
}