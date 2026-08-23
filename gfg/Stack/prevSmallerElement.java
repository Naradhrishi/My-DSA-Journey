class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        
        ArrayList<Integer> prevSmaller = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0;i<arr.length; i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            
            int val = stack.isEmpty() ? -1 : stack.peek();
            prevSmaller.add(val);
            
            stack.push(arr[i]);
            
            
        }
        
        return prevSmaller;
        
    }
}