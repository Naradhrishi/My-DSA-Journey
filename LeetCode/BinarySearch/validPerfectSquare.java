class Solution {
    public boolean isPerfectSquare(int num) {
        long lb = 1, ub = num;
        if(num > 1){ ub = num / 2;}
        
        while(lb <= ub){
            long mid = (ub + lb) / 2;
            if(mid * mid == num){
                return true;
            }
            if(mid * mid < num){
                lb = mid + 1;
            }else{
                ub = mid - 1;
            }
        }
        return false;
    }
}