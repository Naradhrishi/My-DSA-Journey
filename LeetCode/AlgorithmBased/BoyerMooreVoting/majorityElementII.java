class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int majorityElm = nums[0];
        int count1 = 0, count2 = 0;
        int cand1 = Integer.MIN_VALUE, cand2 = Integer.MIN_VALUE;
        for(int num: nums){
            if(num == cand1){
                count1++;
            }else if(num == cand2){
                count2++;
            }else{
            if(count1 == 0 || count2 == 0){
                if(count1 == 0){
                    cand1 = num;
                    count1++;
                    
                }else{
                    cand2 = num;
                    count2++;
                    
                }
            }else{
                count1--;
                count2--;
            }
            
        }
        }
        count1 = 0;
        count2 = 0;
        // now it's time to verify
        for(int num: nums){
            if(num == cand1){
                count1++;
            }else if(num == cand2){
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int len = nums.length;
        len = len/3;
        if(count1 > len){
            ans.add(cand1);
        }
        if(count2 > len){
            ans.add(cand2);
        }
        return ans;
    }
}