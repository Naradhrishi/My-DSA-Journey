class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = tickets[k];
        if(k == 0 && tickets[k] == 1){return 1;}
        for(int i=0; i<tickets.length; i++){
           if(i < k){
            time += Math.min(tickets[i], tickets[k]);
           }else if(i > k){
            time += Math.min(tickets[k] - 1, tickets[i]);
           }
        }
        
        return time;
    }
}