class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == prev){continue;}
            prev = nums[i];
            int j=i+1, k = nums.length - 1;
            int target = 0 - nums[i];
            while(j < k){
                if(nums[j] + nums[k] < target){
                    j++;
                }else if(nums[j] + nums[k] > target){
                    k--;
                }else{
                    List<Integer> triplet = new ArrayList<>(3);
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    res.add(triplet);
                    while(j < k && nums[j] == nums[j+1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }

        return res;
    }
}