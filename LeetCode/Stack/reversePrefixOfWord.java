public class reversePrefixOfWord {
    
}
class Solution {
    public String reversePrefix(String word, char ch) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        boolean isFound =  false;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(isFound){
                sb.append(c);
                continue;
            }
            if(c == ch){
                stack.push(c);
                isFound = true;
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                continue;

            }else{
                stack.push(c);
            }
        }
        if(isFound){
            return sb.toString();
        }else{
            return word;
        }
    }
}