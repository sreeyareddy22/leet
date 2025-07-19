class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        validCombinations(candidates,target,0,0,res,ans);
    return res;
    }
    static void validCombinations(int[] arr,int tar, int idx, int cSum, List<List<Integer>> res,List<Integer> ans){
        if(cSum==tar){
            res.add(new ArrayList<>(ans));
            return;
        }
        if( cSum > tar || idx>=arr.length )
          return;
        ans.add(arr[idx]);
        validCombinations(arr,tar,idx,cSum+arr[idx],res,ans);
        ans.remove(ans.size()-1);
        validCombinations(arr,tar,idx+1,cSum,res,ans);
    }
}