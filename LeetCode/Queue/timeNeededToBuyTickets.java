class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int time = 0, needToBuy = tickets[k];
        for(int i=0; i<tickets.length; i++){
            q.offer(i);
        }
        while(needToBuy > 0){
            int curr = q.poll();
            if(curr == k){
                needToBuy--;
            }
            time++;
            tickets[curr]--;
            if(tickets[curr] != 0){
                q.offer(curr);
            }
        }
        return time;
    }
}