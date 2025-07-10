class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currEnergy = 0, totEnergy = 0, idx = 0;
        int len = cost.length;
        for(int i = 0;i < len;i++){    
            int travel = gas[i]-cost[i] ;
            totEnergy += travel;
            currEnergy += travel;
            if(currEnergy < 0){
                idx = i+1;
                currEnergy = 0;
            }
        }
        if(totEnergy < 0)
            return -1;
        return idx;
    }
}