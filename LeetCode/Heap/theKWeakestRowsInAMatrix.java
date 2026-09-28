class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] weakest = new int[k];
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){count++;}
            }
           
            heap.offer(count * (mat.length * mat[0].length) + i);
            if(heap.size() > k){
                heap.poll();
            }
        }
        
        for(int i=weakest.length-1; i >= 0; i--){
            int val = heap.poll();
           weakest[i] = val % (mat.length * mat[0].length);
        }
        return weakest;
    }
}