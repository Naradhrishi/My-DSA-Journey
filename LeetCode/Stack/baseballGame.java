class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Deque<Integer> stk = new ArrayDeque<>();
        for(int i=0; i<operations.length;i++){
            if(operations[i].equals("D")){
                int val = stk.peek();
                stk.push(val*2);
            }else if(operations[i].equals("C")){
                stk.pop();
            }else if(operations[i].equals("+")){
                int oprTop = stk.pop();
                int oprBottom = stk.pop();
                stk.push(oprBottom);
                stk.push(oprTop);
                
                stk.push(oprTop + oprBottom);
            }else{
                stk.push(Integer.parseInt(operations[i]));
            }
        }

        while(!stk.isEmpty()){
            int val = stk.pop();
            sum += val;
        }
        return sum;
    }
}