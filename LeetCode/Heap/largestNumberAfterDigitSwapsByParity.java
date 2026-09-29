class Solution {
    public int largestInteger(int num) {
        int n = num;
        int[] parity = new int[10];
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int i=10;
        while(n != 0){
            int digit = n % 10;
            i--;
            parity[i] = (digit % 2 != 0) ? -1 : -2;
            heap.offer(digit);
            n = n / 10;
        }
        
        while(!heap.isEmpty()){
            int j = i;
            int digit = heap.poll();
            int digitParity = (digit % 2 != 0) ? -1 : -2;
            while(parity[j] != digitParity){
                j++;
            }
            parity[j] = digit;
        }
        int result = 0;
        while(i < 10){
            result = result * 10 + parity[i];
            i++;
        }
        return result;
    }
}