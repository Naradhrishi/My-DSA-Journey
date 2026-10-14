class RecentCounter {
    int counter;
    Deque<Integer> q;
    public RecentCounter() {
        this.counter = 0;
        q = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        this.counter += 1;
        for(int n : q){
            if(n < t-3000){
                q.poll();
                this.counter -= 1;
            }else{
                break;
            }
        }
        return this.counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */