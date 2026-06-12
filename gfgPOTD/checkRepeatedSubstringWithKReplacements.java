class Solution {
    public boolean kSubstr(String s, int k) {
        int len = s.length();
        int[] arr = new int[k];
        if(len  % k != 0){
            return false;
        }
        if(len == k) return true;
        
        String subStr1 = s.substring(0,k);
        String subStr2 = "";
        
        for(int i=k;i<len;i+=k){
            subStr2 = s.substring(i, i+k);
            if(!subStr2.equals(subStr1)){
                break;
            }
        }
        if(subStr2.equals(subStr1)){
            subStr2 = "";
        }
        
        int index = 0;
        int count1 = 0;
        int count2 = 0;
        
        // check which substring is repeating the most
        while((index = s.indexOf(subStr1, index)) != -1){
            count1++;
            index += k;
        }
        
        index = 0;
        
        if(!subStr2.equals("")){
            while((index = s.indexOf(subStr2, index)) != -1){
                count2++;
                index += k;
            }
        }
        
        //System.out.println(count1 +" "+ count2);
        
        if(count1 >=1 && count2 <= 1 && (((count1 + count2)*k) == len)) return true;
        if(count2 >=1 && count1 <= 1 && (((count1 + count2)*k) == len)) return true;
        
        
        return false;
        
    }
}