class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(!hs.contains(n)){
            hs.add(n);
            sum = sumOfDigitSquares(n);
            if(sum == 1)
                return true;
            n = sum;
            System.out.println(sum);
        }
        return false;
    }
    static int sumOfDigitSquares(int n){
        int sum = 0;
        while(n != 0){
            int d = n%10;
            sum += d*d;
            n = n/10;
        }
        return sum;
    }
}