class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> subAns = new ArrayList<>();
        helper(nums, 0,subAns);
        return ans;
    }

    public void helper(int[] arr, int index, List<Integer> subAns){
        System.out.println(index);
        if(index == arr.length){
            ans.add(new ArrayList<>(subAns));
            //System.out.println(subAns);
            return;
        }
        
        helper(arr,index+1, subAns);
        
        List<Integer> nextSubAns = new ArrayList<>(subAns);
        nextSubAns.add(arr[index]);
        
        helper(arr, index+1, nextSubAns);
    }
}