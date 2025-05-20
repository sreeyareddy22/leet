class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0;i < n;i++){
            int j = i+1,k = n-1;
            if(i > 0 && arr[i] == arr[i-1]) continue;
            while(j < k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum > 0)
                    k--;
                else if(sum < 0)
                    j++;
                else{
                    List<Integer> ans = Arrays.asList(arr[i],arr[j],arr[k]);
                    res.add(ans);
                    j++;k--;
                    while(j < k &&arr[j] == arr[j-1])
                        j++;
                    while(j < k && arr[k] == arr[k+1])
                        k--;
                }
            }
        }
    return res;
    }
}