class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            char str[] = s.toCharArray();
            Arrays.sort(str);
            String org = new String(str);
            if(!hm.containsKey(org)){
                List<String> a = new ArrayList<>();
                a.add(s);
                hm.put(org,a);
            }
            else{
                List<String> exi = hm.get(org);
                exi.add(s);
                hm.put(org,exi);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String,List<String>> e : hm.entrySet()){
            List<String> group = e.getValue();
            res.add(group);
        }
        return res;
    }
}