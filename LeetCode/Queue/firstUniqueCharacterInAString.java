class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        
        for(int i=0;i<s.length(); i++){
            char curr = s.charAt(i);
            arr[curr - '0' - 49] += 1;
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(arr[c - '0' - 49] == 1){
                return i;
            }
        }
        return -1;
    }
}