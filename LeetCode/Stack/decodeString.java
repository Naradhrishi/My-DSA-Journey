class Solution {
    public String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(curr == ']'){
                StringBuilder sb = new StringBuilder();

                while(stack.peek() != '['){
                    sb.append(stack.pop());

                }
                stack.pop(); // [ removed
                String n = "";
                while(!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9'){
                    int times = Integer.parseInt("" + stack.pop());
                    n = times + n;
                }
                sb.reverse();
                String encodedText  = sb.toString();
                for(int j=1; j<Integer.parseInt(n); j++){
                    sb.append(encodedText);
                }
                
                // now push back everything again
                for(int k=0; k<sb.length(); k++){
                    stack.push(sb.charAt(k));
                }
                

            }else{
                stack.push(curr);
                
            }
        }
        int size = stack.size();
        StringBuilder sb2 = new StringBuilder(stack.size());
        for(int i = 0; i < size; i++){
            char popped = stack.pop();
            sb2.append(popped);
            
        }
        return sb2.reverse().toString();
        
    }
}