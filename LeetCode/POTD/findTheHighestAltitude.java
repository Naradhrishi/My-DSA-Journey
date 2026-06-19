class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int alt = 0;
        for(int num : gain){
            if((alt+num) > maxAlt){
                maxAlt = (alt+num);
                
            }
            alt = alt + num;
        }
        return maxAlt;
    }
}