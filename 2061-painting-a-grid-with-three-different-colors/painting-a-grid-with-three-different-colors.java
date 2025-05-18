class Solution {
    private final int mod = 1000000007;
    List<int[]> sol;
    public int colorTheGrid(int m, int n) {
        sol = new ArrayList<>();
        genSolutions(m,0,0,new int[m]);
        m = sol.size();
        int[][] dp = new int[n][m];

        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        int ans = 0;
        
        for(int i = 0;i < m;i++){
            ans += find(dp,1,i,n,m);
            ans %= mod;
        }
        ans = ans%mod;
    return ans;
    }
    public int find(int[][] dp,int i,int j,int n,int m){
        if(i == n)
            return 1;
        if(dp[i][j] != -1)
            return dp[i][j];
        int ans = 0;
        for(int k = 0;k < m;k++){
            if(isCond(k,j)){
                ans += find(dp,i+1,k,n,m);
                ans %= mod;
            }
        }
        return dp[i][j] = ans%mod;
    }
    public boolean isCond(int x,int y){
        int n = sol.get(x).length;
        for(int i = 0;i < n;i++){
            if(sol.get(x)[i] == sol.get(y)[i])
                return false;
        }
    return true;
    }
    public void genSolutions(int m, int prev, int idx, int[] nums){
        if(idx == m){
            sol.add(Arrays.copyOf(nums,m));
            return;
        }

        for(int i = 1; i< 4;i++){
            if(i != prev){
                nums[idx] = i;
                genSolutions(m,i,idx+1,nums);
                nums[idx] = 0;
            }
        }
    }
}