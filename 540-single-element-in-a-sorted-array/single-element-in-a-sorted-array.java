        class Solution {
            public int singleNonDuplicate(int[] nums) {
                int l = 0, h = nums.length-1;
                if(nums.length == 1)
                    return nums[0];
                while(l < h){
                    int mid = (l+h)/2;
                    if( mid%2 == 1)
                        mid--;
                    if(nums[mid] != nums[mid+1]){
                        h = mid;
                    }
                    else
                        l = mid+2;
                }
            return nums[l];
            }
        }