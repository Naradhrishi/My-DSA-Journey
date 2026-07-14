class Solution {
    public String toHex(int num) {
        long n = num;
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        StringBuilder sb = new StringBuilder();
        // if the number is negetive then add 4294967296
        if(n < 0){
            n = fixNegetive(n);
        }
        while(n >= 16){
            long rem = n % 16;
            n = n / 16;
            sb.append(hex[(int)rem]);
        }
        sb.append(hex[(int)n]);

        return sb.reverse().toString();
    }

    public long fixNegetive(long n){
        return n + 4294967296L;
    }
}