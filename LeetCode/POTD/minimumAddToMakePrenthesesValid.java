class Solution {
    public int minAddToMakeValid(String s) {
        int total = 0, c = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(c < 0){
                    total += Math.abs(c);
                    c = 0;
                }
                c++;
            }else{
                c--;
            }
        }
        return Math.abs(c) + total;
    }
}