class Solution {
    public int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s : logs){
            if(s.equals("../")){
                // pop from the stack if not empty
                if(!stack.isEmpty()){
                    stack.pop();
                }

            }else if(s.equals("./")){
                // don't do anything
            }else{
                stack.push(s);
            }
        }
        return stack.size();
    }
}