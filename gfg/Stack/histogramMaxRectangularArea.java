class Solution {
    public static int getMaxArea(int arr[]) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ps = new int[arr.length];
        int[] ns = new int[arr.length];
        Arrays.fill(ps, -1);
        Arrays.fill(ns, arr.length);
        int maxArea = 0, area = 0;
        
        
        for(int i=0; i<arr.length; i++){
            
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                ns[stack.pop()] = i;
            }
            
            if(!stack.isEmpty()){ps[i] = stack.peek();}
            
            stack.push(i);
        }
        
        for(int i=0; i<arr.length; i++){

            area = (ns[i] - ps[i] -1) * arr[i];
            maxArea = (area > maxArea) ? area : maxArea;
        }
        
        return maxArea;
    }
}
