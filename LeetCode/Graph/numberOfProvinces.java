class Solution {
    public int findCircleNum(int[][] isConnected) {
       int counter = 0;
       boolean[] isVisited = new boolean[isConnected.length];
       Deque<Integer> q = new ArrayDeque<>();

       for(int i=0;i<isConnected.length;i++){
            if(doBFS(i, isVisited, q, isConnected)){
                counter++;

            }
       }

       return counter;
        
    }
    public boolean doBFS(int startingVertex, boolean[] isVisited, Deque<Integer> q, int[][] isConnected){
        boolean flag = false;
        if(!isVisited[startingVertex]){
            isVisited[startingVertex] = true;
            q.offer(startingVertex);
            flag = true;
        }
        while(!q.isEmpty()){
            int currentVertex = q.poll();
            
            int[] neighbors = isConnected[currentVertex];
            for(int i=0; i < neighbors.length; i++){
                if(neighbors[i] == 1){
                    if(!isVisited[i]){
                        isVisited[i] = true;
                        q.offer(i);
                    }
                }
            }
            
            
        }
        return flag;


    }
}