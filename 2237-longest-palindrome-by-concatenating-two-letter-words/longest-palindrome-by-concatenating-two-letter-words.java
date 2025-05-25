class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> hm = new HashMap<>();
        for(int i = 0;i < words.length;i++){
            String key = words[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int res = 0;
        boolean mid = false;
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            String s1 = e.getKey();
            int v1 = e.getValue();
            String s2 = new StringBuilder(s1).reverse().toString();
            if(s1.equals(s2)){
                res += 4*(v1/2);
                if(v1%2 == 1)
                    mid = true; 
                continue;
            }
            if(hm.containsKey(s2)){
                int v2 = hm.get(s2);
                int mini = Math.min(v1,v2);
                res += (4*mini);
                hm.put(s2,0);
            }
        }   
        if(mid) res += 2;
    return res;
    }
}