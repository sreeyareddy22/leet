class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> hm = new HashMap<>();
        for(int i = 0;i < words.length;i++){
            String key = words[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int res = 0;
        int cnt = 0;
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            String s1 = e.getKey();
            int v1 = e.getValue();
            char c1 = s1.charAt(0),c2 = s1.charAt(1);
            if(c1 == c2){
                res += 4*(v1/2);
                cnt = Math.max(cnt,2*(v1%2));
                continue;
            }
            String s2 = s1.charAt(1)+""+s1.charAt(0);
            if(hm.containsKey(s2)){
                int v2 = hm.get(s2);
                int mini = Math.min(v1,v2);
                res += (4*mini);
                v1 -= mini;
                v2 -= mini;
                hm.put(s1,v1);hm.put(s2,v2);
            }
        }   
    return res+cnt;
    }
}