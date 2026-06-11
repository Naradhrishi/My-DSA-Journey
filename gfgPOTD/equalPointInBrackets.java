class Solution {
    public int findIndex(String s) {
        int openingBracesC = 0;
        for(int i=0;i< s.length();i++){
            if(s.charAt(i) == '('){
                openingBracesC++;
            }
        }
        return s.length() - openingBracesC;
    }
}