class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            heap.offer(nums[i]);
            if(heap.size() > 2){
                heap.poll();
            }
        }
        return (heap.poll() - 1) * (heap.poll() - 1);
        
    }
}