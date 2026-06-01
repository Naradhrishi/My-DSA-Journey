class Solution {
    public int minimumCost(int[] cost) {
        int minCost = 0;
        
        Arrays.sort(cost);

        // Reverse 
        for (int i = 0, j = cost.length - 1; i < j; i++, j--) {
             int tmp = cost[i]; cost[i] = cost[j]; cost[j] = tmp;
        }
        
        for(int i=1;i<=cost.length;i++){
            System.out.println(cost[i-1]);
            if(i%3 != 0){
                minCost += cost[i-1];
            }
        }
        
        return minCost;
    }
}