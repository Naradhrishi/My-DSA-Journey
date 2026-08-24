class Solution {
    public static int getMaxArea(int arr[]) {
        List<int[]> nextSmaller = new ArrayList<>();
        List<int[]> prevSmaller = new ArrayList<>();
        
        Deque<int[]> stack = new ArrayDeque<>();
        
        int maxArea = 0;
        // check prev smaller
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()[0] >= arr[i]){
                stack.pop();
            }
            
            int[] val = stack.isEmpty() ? new int[]{-1,-1} : stack.peek();
            prevSmaller.add(val);
            
            stack.push(new int[]{arr[i], i});
            
        }
        
        stack.clear();
        
        // next smaller
        for(int i=arr.length-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek()[0] >= arr[i]){
                stack.pop();
            }
            
            int[] val = stack.isEmpty() ? new int[]{-1,arr.length} : stack.peek();
            nextSmaller.add(val);
            
            stack.push(new int[]{arr[i], i});
            
        }
        Collections.reverse(nextSmaller);
        
        
        for(int i=0; i<prevSmaller.size(); i++){
            int next = nextSmaller.get(i)[1];
            int prev = prevSmaller.get(i)[1];
            
            
        
            int area = ((next - prev) - 1) * arr[i];
            
            maxArea = area > maxArea ? area : maxArea;
        }
        
        return maxArea;
        
    }
}
