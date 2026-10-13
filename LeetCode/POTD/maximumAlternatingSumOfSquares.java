class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int i = 0; i < n; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(sq);

        long sum = 0;
        int range = n / 2;

        for (int i = 0; i < n; i++) {
            if (i < range) sum -= sq[i];
            else sum += sq[i];
        }
        return sum;
    }
}