class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums)
            maxHeap.add(i);
        int res = 0;
        for(int i = 0 ; i < k;i++){
            res = maxHeap.poll();
        }
    return res;
    }
}