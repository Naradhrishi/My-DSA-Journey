class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> q = new ArrayDeque<>();
        int top = 0;
        for(int s : students){
            q.offer(s);
        }
        int count = 0;
        while(true){
            int curr = q.pop();
            if(curr == sandwiches[top]){
                top++;
                count = 0;

            }else{
                q.offer(curr);
                count++;
            }
            if(count >= q.size()){break;}

        }
        return q.size();
    }
}