class Solution {
    public int numTrees(int n) {
       long catalan = 1; 
        // formula for nth catalan number is (2n!)/((n+1)! * n!)
        for (int i = 0; i < n; i++) {
            catalan = catalan * (2 * n - i) / (i + 1);
        }
        
        return (int) (catalan / (n + 1));
    }

}