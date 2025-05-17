class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-1;
        while(i > 0 && nums[i-1] >= nums[i]){
            i--;
        }
        if(i == 0){
            reverse(nums,0,n-1);
            return;
        }
        int j = n-1;
        while(j >= i && nums[j] <= nums[i-1]){
            j--;
        }
        swap(i-1,j,nums);
        reverse(nums,i,n-1);
    }
    static void reverse(int arr[],int i,int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}