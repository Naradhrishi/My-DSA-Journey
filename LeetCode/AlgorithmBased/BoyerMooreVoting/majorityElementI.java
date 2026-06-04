class Solution {
    public int majorityElement(int[] nums) {
        int majorityElm=0, count = 0;
        for(int i=0;i<nums.length;i++){
            if(i == 0){
                majorityElm = nums[i];
                count++;
            }else{
                if(nums[i] == majorityElm){
                    count++;
                }else{
                    count--;
                    if(count == 0){
                    majorityElm = nums[i];
                    count++;
                    }
                }
            }
        }
        count = 0;
        for(int num : nums){
            if(num == majorityElm){
                count++;
            }
        }
        if(count > (nums.length/2)){
            // there is a majority element 
        }else{
            // otherwise no majority element
            
        }
        return majorityElm;
        
    }
}