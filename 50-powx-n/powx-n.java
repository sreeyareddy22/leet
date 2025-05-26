class Solution {
    public double myPow(double x, int n) {
        if(x == 1)
            return x;
        long exp = n;
        double ans = 1;
        if( exp < 0){
            exp = -exp;
            x = 1/x;
        }
        while(exp != 0){
            if((exp&1) != 0){
                ans = ans*x;
            }
            x *= x;
            exp = exp >> 1;
        }
    return ans;
    }
}