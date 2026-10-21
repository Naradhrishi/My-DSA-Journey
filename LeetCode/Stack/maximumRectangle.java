class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] histogram = new int[matrix[0].length];
        int rectArea = 0, maxRectArea = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    histogram[j] += 1;
                }else{
                    histogram[j] = 0;
                }
            }
            rectArea = calculateMaxRect(histogram);
            if(rectArea > maxRectArea){
                maxRectArea = rectArea;
            }

        }
        return maxRectArea;
    }
    private int calculateMaxRect(int[] histogram){
        Deque<Integer> stack = new ArrayDeque<>();
        int[] pSmaller = new int[histogram.length];
        int[] nSmaller = new int[histogram.length];
        Arrays.fill(pSmaller, -1);
        Arrays.fill(nSmaller, histogram.length);
        int area = 0, maxArea = 0;
        for(int i=0; i<histogram.length; i++){
            while(!stack.isEmpty() && histogram[stack.peek()] > histogram[i]){
                nSmaller[stack.pop()] = i;
            }
            if(!stack.isEmpty()){
                pSmaller[i] = stack.peek();

            }
            stack.push(i);
        }
        for(int i=0; i<histogram.length; i++){
            area = (nSmaller[i] - pSmaller[i] -1) * histogram[i];
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}