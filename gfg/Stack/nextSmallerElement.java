class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> next_smaller = new ArrayList<>();
        int[] res = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = arr.length-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        
        for(int v : res){
            next_smaller.add(v);
        }
        
        return next_smaller;
    }
}