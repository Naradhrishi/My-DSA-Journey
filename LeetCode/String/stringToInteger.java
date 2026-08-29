class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isNeg = false;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr >= '0' && curr <= '9'){
                sb.append(curr);
            }else if((curr == '-' || curr == ' ' || curr == '+') && sb.length() == 0){
                if(curr == '-'){
                    sb.append(curr);
                    isNeg = true;
                }else if(curr == '+'){
                    sb.append(curr);
                }
            }else{
                
                break;
            }
        }
        int num = 0;
        for(int i=0; i<sb.length(); i++){
            char curr = sb.charAt(i);
            if((curr == '-' || curr == '+') && i == 0 ){
                // just do nothing
                
            }else{
                if(num > (Integer.MAX_VALUE - (int)(curr - '0')) / 10){
                    
                    if(isNeg){
                        return Integer.MIN_VALUE;
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }
                num = num * 10 + (int)(curr - '0');
                
            }
        }
        if(isNeg){
            return num * -1;
        }
        return num;
        
    }
}