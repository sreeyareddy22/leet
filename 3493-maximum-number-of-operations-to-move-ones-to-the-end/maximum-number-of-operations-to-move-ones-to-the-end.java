class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '1')
                al.add(i);
        }
        int m = al.size();
        if((n == 1 && m == 1) || m == 0 || (m == 1 && al.get(m-1) == n-1))
            return 0;
        if(m == 1)
            return 1;
        int cnt = 0;
        for(int i = 0;i < m-1;i++){
            if(al.get(i+1)-al.get(i) > 1){
                cnt += i+1; 
                al.set(i,al.get(i+1)-1);
            }
            System.out.println(cnt);
        }
        if(al.get(m-1) != n-1)
            cnt += m;
        return cnt;
    }
}