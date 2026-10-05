class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        Deque<String> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            System.out.println(score);
            if(curr == '('){
                if(score != 0){stack.push(score+"");score = 0;}
                stack.push("(");
                
            }else if(curr == ')'){
                if(stack.peek() != "("){
                    while(stack.peek() != "("){
                        score += Integer.parseInt(stack.peek());
                        stack.pop();
                    }
                    if(stack.peek() == "("){
                        score *= 2;
                        stack.pop();
                        
                    }
                }else{
                    if(score == 0){
                        score += 1;
                        stack.pop();
                        
                    }else{
                        score *= 2;
                        stack.pop();
                    }
                }

            }
            
        }
        while(stack.size() != 0){
            System.out.println(stack.peek());
            score += Integer.parseInt(stack.peek());
            stack.pop();
        }
        return score;
    }
}