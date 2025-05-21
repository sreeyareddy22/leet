class Solution {
    public void setZeroes(int[][] arr) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(arr[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int p : row){
            for(int j = 0;j < n;j++){
                arr[p][j] = 0;
            }
        }
        for(int p : col){
            for(int i = 0;i < m;i++){
                arr[i][p] = 0;
            }
        }
    }
}