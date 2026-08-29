class Solution {
    public String convert(String s, int numRows) {
        // skip loop for 0 and n-1 -> how much, skip = n + ( n - 2) = 3 + 1 = 4 increment to select next
        // for middle -> skip - ( 2 * i)
        if (numRows == 1 || numRows >= s.length()){ return s; }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numRows; i++){
            if(i == 0 || i == numRows - 1){

                int skip = i;
                while(skip < s.length()){
                    sb.append(s.charAt(skip));
                    skip += numRows + (numRows - 2);
                }
            }else{
                int skip = numRows + (numRows - 2);
                int abnormalSkip = numRows + (numRows - 2) - (2 * i);
                int currSkip = i;
                while(currSkip < s.length()){
                    sb.append(s.charAt(currSkip));
                    if(currSkip + abnormalSkip < s.length()){
                        sb.append(s.charAt(currSkip + abnormalSkip));
                    }
                    currSkip += skip;
                }
            }
        }
        
        return sb.toString();


    }
}