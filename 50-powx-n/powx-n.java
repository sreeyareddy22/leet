class Solution {
    public double myPow(double x, int n) {
        if(x == 1)
            return x;
        double ans = 1;
        if( n < 0){
            n = -n;
            x = 1/x;
        }
        while(n != 0){
            if((n&1) != 0){
                ans = ans*x;
            }
            x *= x;
            n = n >>> 1;
        }
    return ans;
    }
}