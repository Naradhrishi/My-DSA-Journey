class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        String[] letters = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(digits, "", letters, res, 0);
        return res;
        
    }
    public void helper(String digits, String comb, String[] letters, List<String> res, int currIndex){
        if(comb.length() == digits.length()){
            res.add(comb);
            return;
        }
        String s = letters[digits.charAt(currIndex) - '0'];
        for(int i=0; i<s.length(); i++){
            helper(digits, comb + s.charAt(i), letters, res, currIndex + 1);
        }
    }
    
}