class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Deque<Integer> less = new ArrayDeque<>();
        Deque<Integer> equal = new ArrayDeque<>();
        Deque<Integer> more = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] < pivot){
                less.push(nums[i]);
            }else if(nums[i] == pivot){
                equal.push(nums[i]);
            }else{
                more.push(nums[i]);
            }
        }
        for(int i = nums.length-1; i>=0;i--){
            if(!more.isEmpty()){
                int val = more.pop();
                nums[i] = val;
            }else if(!equal.isEmpty()){
                int val = equal.pop();
                nums[i] = val;
            }else if(!less.isEmpty()){
                int val = less.pop();
                nums[i] = val;
            }
        }
        return nums;
        
    }
}