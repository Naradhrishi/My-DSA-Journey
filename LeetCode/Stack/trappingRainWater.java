class Solution {
    public int trap(int[] height) {
        int l=0, lMax = height[0], r = height.length -1, rMax = height[height.length -1], water = 0;
        while(l < r){
            if(height[l] <= height[r]){
                l++;
                if(height[l] > lMax){
                    lMax = height[l];
                }
                water += Math.abs(height[l] - lMax);
            }else{
                r--;
                if(height[r] > rMax){
                    rMax = height[r];
                    
                }
                water += Math.abs(height[r] - rMax);
            }
            
        }
        return water;
    }
}