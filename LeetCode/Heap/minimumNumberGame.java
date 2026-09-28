class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            heap.offer(nums[i]);
        }
        int i=0;
        while(!heap.isEmpty()){
            int alice = heap.poll();
            int bob = heap.poll();
            arr[i] = bob;
            i++;
            arr[i] = alice;
            i++;
        }
        return arr;
    }
}