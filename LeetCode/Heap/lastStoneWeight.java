class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<stones.length; i++){
            heap.add(stones[i]);
        }
        while(!heap.isEmpty()){
            if(heap.size() > 1){
                int y = heap.poll();
                int x = heap.poll();
                if(x != y){heap.add(y-x);}
            }else{break;}
        }
        if(!heap.isEmpty()){
            return heap.poll();
        }
        return 0;
    }
}