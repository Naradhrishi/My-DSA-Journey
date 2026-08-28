class Solution {
    public String clearDigits(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr >= '0' && curr <= '9'){
                stack.pop();
            }else{
                stack.push(curr);
            }
            
        }
        StringBuilder sb =  new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}