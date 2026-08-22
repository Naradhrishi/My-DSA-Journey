class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> final_res = new ArrayList<>();
        int[] res = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        
        for(int i=arr.length-1; i >= 0; i--){
            if(stack.isEmpty()){
                res[i] = -1;
            }else{
                while(!stack.isEmpty()){
                    int top = stack.peek();
                    if(top < arr[i]){
                        res[i] = top;
                        break;
                    }else{
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        res[i] = -1;
                    }
                }
            }
            stack.push(arr[i]);
        }
        for(int v : res){
            final_res.add(v);
        }
        return final_res;
    }
}