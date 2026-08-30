class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String s = "";
        helper(n, s, res);
        return res;

    }
    public void helper(int n, String s, List<String> res){
        if(s.length() == n * 2){
            int c = 0;
            boolean isValid = true;
            for(int i=0; i<s.length(); i++){
                char curr = s.charAt(i);
                if(curr == '('){
                    c++;
                }else{
                    c--;
                }
                if(c < 0 || c > n){
                    isValid = false;
                }
            }

            if(isValid && c == 0){
                res.add(s);
            }
            
            return;
        }
        
        
        helper(n, s+"(", res);
        helper(n, s+")", res);

    }
}