class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] pSmaller = new int[heights.length];
        int[] nSmaller = new int[heights.length];
        Arrays.fill(pSmaller, -1);
        Arrays.fill(nSmaller, heights.length);
        int area = 0, maxArea = 0;
        for(int i=0; i<heights.length; i++){
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                nSmaller[stack.pop()] = i;
            }
            if(!stack.isEmpty()){
                pSmaller[i] = stack.peek();

            }
            stack.push(i);
        }
        for(int i=0; i<heights.length; i++){
            area = (nSmaller[i] - pSmaller[i] -1) * heights[i];
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}