class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i = 0,j = 0;
        int n = fruits.length;
        int maxi = 0;
        while(i < n && j < n){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            while(i < n && hm.size() > 2){
                int key = fruits[i];
                hm.put(key,hm.get(key)-1);
                if(hm.get(key) == 0)
                    hm.remove(key);
                i++;
            }
            maxi = Math.max(j-i+1,maxi);
            j++;
        }
        return maxi;
    }
}