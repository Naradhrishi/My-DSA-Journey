class Solution {
    public int numTrees(int n) {
        double catalan = 1.0;
        for (int i = n+2, j = 2; i <= (2*n); i++, j++) {
            catalan = catalan * ((double)i/j);
        }
        return (int)Math.round((catalan));
        
    }

}