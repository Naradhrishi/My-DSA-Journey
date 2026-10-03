class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        
        comb(n, res, "(", 1);
        return res;
        
    }
    private void comb(int n, List<String> res, String s, int c){
        if(c < 0){return;}
        if(s.length() == 2*n){
            if(c == 0){res.add(s);}
            return;
        }
        comb(n, res, s+"(", c+1);
        comb(n, res, s+")", c-1);
    }
}