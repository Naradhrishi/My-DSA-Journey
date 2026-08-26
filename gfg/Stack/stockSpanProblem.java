class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        int[] span = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            span[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
            
            
        }
        
        for(int i=0;i<arr.length;i++){
            res.add(i - span[i]);
        }
        return res;
    }
}