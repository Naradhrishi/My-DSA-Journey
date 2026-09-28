public class maximumNestingDepthOfTheParentheses {
    
}
class Solution {
    public int maxDepth(String s) {
        int count = 0, max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){count++;}
            if(s.charAt(i) == ')'){
                if(count > max){max = count;}
                count--;
            }
        }
        return max;
    }
}